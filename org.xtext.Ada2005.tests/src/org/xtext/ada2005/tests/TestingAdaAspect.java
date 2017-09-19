package org.xtext.ada2005.tests;

import static org.junit.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.xtext.ada2005.AdbInjectorProvider;
import org.xtext.ada2005.AdbStandaloneSetup;
import org.xtext.ada2005.adb.Compilation;
import org.xtext.ada2005.adb.SequenceOfStatements;
import org.xtext.ada2005.adb.SubprogramBody;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;


@RunWith(value=XtextRunner.class)
@InjectWith(AdbInjectorProvider.class)


public class TestingAdaAspect {
	
	protected void deleteDirContent(java.io.File dir)
	{
	    // Cleans the output directory
	    File files[] = dir.listFiles();
	    for (int i = 0; files != null && i < files.length; i++)
	    {
	    	if (files[i].isFile())
	    	   files[i].delete();
	    	else
	    	{
	    	   deleteDirContent(files[i]);
	    	   files[i].delete();
	    	}
	    	  
	    }
	}	
	
	static protected class FilterAdbFile implements FilenameFilter 
	{
		@Override
        public boolean accept(File dir, String name) 
        {
           if(name.lastIndexOf('.')>0)
              {
              // get last index for '.' char
              int lastIndex = name.lastIndexOf('.');
              
              // get extension
              String str = name.substring(lastIndex);
              
              // match path name extension
              if (str.equals(".adb"))
                 {
                 return true;
                 }
              }
           return false;
        }
	};
	
	static ArrayList<File> files = null;
	static HashMap<String, Integer> filesIndexAssociations = null;
	static XtextResourceSet resourceSet = null;
	static Compilation model;
	XtextResource resource = null;
	private String runningTestName;
	
	   abstract class XtextModelModifier {	   

	   public abstract void update(INode node);
		   
	   class Mod implements Comparable<Mod> 
	   {
		   public Mod(int offset, int lengthReplaced, String replacingText) {
			super();
			this.offset = offset;
			this.lengthReplaced = lengthReplaced;
			this.replacingText = replacingText;
		}
		int offset, lengthReplaced;
		   String replacingText;
		@Override
		public int compareTo(Mod o) {
			return  o.offset - this.offset;
		}
	   }
	   
	   private LinkedList<Mod> mods = new LinkedList<Mod>();	
	   
	   public void replace(int offset, int lengthReplaced, String theReplacingText)
	   {
		   mods.add(new Mod(offset, lengthReplaced, theReplacingText));
	   }
	   
	   protected String doReplace(Mod mod, String content)
	   {
		   String part1 = content.substring(0, mod.offset);
		   String part3 = content.substring(mod.offset + mod.lengthReplaced, content.length());
		   return part1 + mod.replacingText + part3;
	   }
	   
	   public String apply(String content)
	   {
		Collections.sort(mods);
		for (Mod mod : mods)
		{
			content = doReplace(mod, content);
		}
		return content;
	   }
	}
	
	enum CR { OK, NOK, NOK2 };
	
	static
		{
		    File indir = new File("utest.aspect.indata/");
		    files = new ArrayList<File>(Arrays.asList(indir.listFiles(new FilterAdbFile())));		   
		    
		    filesIndexAssociations = new HashMap<String, Integer>(files.size());
		
		    for (int i = 0; i < files.size(); i++)
		    {
		    filesIndexAssociations.put(files.get(i).getName().replaceAll("\\.adb", ""), new Integer(i));
		    }
			AdbStandaloneSetup.doSetup();
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			resourceSet = AdbStandaloneSetup.injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		}

	void updateNodes(INode rootNode, Class<? extends EObject> searchedGramEltType, XtextModelModifier modifier)
	{
		/** Visit deeper nodes before */
		for (BidiTreeIterator<INode> it = rootNode.getAsTreeIterable().iterator(); it.hasNext();)
		{
			INode childNode = it.next();
			if (childNode instanceof CompositeNodeWithSemanticElement)
			{
			if (searchedGramEltType.isAssignableFrom(childNode.getSemanticElement().getClass())) {
				modifier.update(childNode);				
			}
			}
									
		}
		/** Then visit the root node */ 
		if (rootNode != null && (searchedGramEltType.isAssignableFrom(rootNode.getSemanticElement().getClass()))) {
			modifier.update(rootNode);				
		}
		
	    /** Finally, visit the sbling nodes of rootNode */
		for (INode siblingNode = rootNode.getNextSibling(); siblingNode != null && siblingNode.hasNextSibling(); siblingNode = siblingNode.getNextSibling())
		{
			if (searchedGramEltType.isAssignableFrom(siblingNode.getSemanticElement().getClass())) {
				modifier.update(siblingNode);				
			}
		}		
	}
	
	
	void printNodes(INode rootNode)
	{
		/** Then visit the root node */ 
		if (rootNode != null) {
			printNode(rootNode);
		}
		
	    /** Finally, visit the sbling nodes of rootNode */
		for (INode siblingNode = rootNode.getNextSibling(); siblingNode != null && siblingNode.hasNextSibling(); siblingNode = siblingNode.getNextSibling())
		{
			printNode(siblingNode);
		}
		
		/** Visit deeper nodes before */
		for (BidiTreeIterator<INode> it = rootNode.getAsTreeIterable().iterator(); it.hasNext();)
		{
			INode childNode = it.next();
			printNode(childNode);
		}		
	}
	
	void printNode(INode node)
	{
		Method getName;
		try {
			getName = node.getGrammarElement().getClass().getMethod("getName",new Class<?>[]{});
		} catch (NoSuchMethodException | SecurityException e) {
			getName = null;			
		}
		String info;
		if (getName != null)
		{
			try {
				info = (String) getName.invoke(node.getGrammarElement()) + " : " + node.getGrammarElement().getClass().getName();
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				info = node.getGrammarElement().toString();;
				e.printStackTrace();
			}
		}
		else
		{
			if (node.getGrammarElement() instanceof RuleCall)
			{
				info = ((RuleCall) node.getGrammarElement()).getRule().getName();
				info += " : " + node.getGrammarElement().getClass().getName();
			}
			else
			{
				info = node.getGrammarElement().toString();
			}
		}
		System.out.print(info + " = ");
		System.out.println("'" + node.getText() + "'");
		
	}
	
	INode get(INode rootNode, Class<? extends EObject> searchedGramEltType)
	{
		/** Then visit the root node */ 
		if (rootNode != null && (searchedGramEltType.isAssignableFrom(rootNode.getSemanticElement().getClass()))) {
			return rootNode;				
		}
		
	    /** Finally, visit the sbling nodes of rootNode */
		for (INode siblingNode = rootNode.getNextSibling(); siblingNode != null && siblingNode.hasNextSibling(); siblingNode = siblingNode.getNextSibling())
		{
			if (searchedGramEltType.isAssignableFrom(siblingNode.getSemanticElement().getClass())) {
				return siblingNode;				
			}
		}
		
		/** Visit deeper nodes before */
		for (BidiTreeIterator<INode> it = rootNode.getAsTreeIterable().iterator(); it.hasNext();)
		{
			INode childNode = it.next();
			if (searchedGramEltType.isAssignableFrom(childNode.getSemanticElement().getClass())) {
				return childNode;				
			}								
		}
     return null;
	} 
	
	class XtextModelModifier_BlockTrace extends XtextModelModifier
	{
		public void update(INode node)
		{
			SubprogramBody body = (SubprogramBody) node.getSemanticElement();
			INode statements  = get(node, SequenceOfStatements.class); 
			if (statements != null)
			{
			String endl = System.getProperty("line.separator");
			String prologue = "text_io.put_line(\"Entering in " + body.getSubprogramSpecification().getName() + "\");" + endl;
			replace(statements.getOffset(), 0, prologue);
			String epilogue = endl + "text_io.put_line(\"Exiting from " + body.getSubprogramSpecification().getName() + "\");";
			replace(statements.getEndOffset(), 0, epilogue);
			}
		}
	}
	
    CR run(int argAdafileIndex)
    {
    	CR cr = CR.OK;
    	
    	String insourcefilename = files.get(argAdafileIndex).getPath();
    	File insourceFile = new File(insourcefilename);
    	
		File outdir = getOutDir(insourcefilename);
		
		deleteDirContent(outdir);
		
		outdir.mkdirs();
		
		PrintStream execution_errors_log = null;
		
		try {
			execution_errors_log = new PrintStream(new File(outdir, "execution_errors.log"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return CR.NOK2;
		}
    	
		File outsourceFile = new File(outdir, insourceFile.getName()); 
		
		try {
			FileUtils.copyFile(insourceFile, outsourceFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			return CR.NOK2;
		}
		
    	resource = (XtextResource) resourceSet.getResource(URI.createURI(outsourceFile.getPath()), true);
    	
    	INode root = resource.getParseResult().getRootNode();
    	
    	XtextModelModifier_BlockTrace modifier = new XtextModelModifier_BlockTrace();
    	
    	printNodes(root);
    	
    	updateNodes(root, SubprogramBody.class, modifier);
    	
    	String content = modifier.apply(root.getText());
    	
    	System.out.print(content);
    	
    	@SuppressWarnings("unused")
		String newContent = "procedure toto is\n" +
    	                    "begin\n" +
    			            "null;\n" +
    	                    "end toto;\n";
    	
    	try {
			resource.reparse(content);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
		EList<Resource.Diagnostic> errors = ((Resource) resource).getErrors();	        	
		
		if (!errors.isEmpty())
		{
			File errorsLog = new File(outdir, "syntax_errors.log");
			PrintStream syntax_errors = null;
			try {
				syntax_errors = new PrintStream(errorsLog);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.printStackTrace(execution_errors_log);
				cr = CR.NOK2;
				return cr;
			}
			
			for (org.eclipse.emf.ecore.resource.Resource.Diagnostic error : errors)
			{
				System.err.print(error.getLine() + ":");
				System.err.println(error.getMessage());
				syntax_errors.print(error.getLine() + ":");
				syntax_errors.println(error.getMessage());
				cr = CR.NOK;				
			}
		syntax_errors.close();
		}
		//else
		{
			try {
				resource.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				cr = CR.NOK2;
			}
		}
		

		return cr;		
    }

	/**
	 * @param insourcefilename
	 * @return output directory for the test
	 */
	private File getOutDir(String insourcefilename) {
		File outdir = new File(insourcefilename);
		outdir = outdir.getParentFile();
		Path outdirpath = outdir.toPath();
		outdirpath = new File("utest.aspect.indata").toPath().relativize(outdirpath);
		String outdirstring = "utest.aspect.outdata/" + outdirpath.toString();		
		return new File(outdirstring +  "/" + runningTestName);
	}
    
    CR run(String argTestname)
    {
    	runningTestName = argTestname;
    	return run(filesIndexAssociations.get(argTestname));    	
    }
    
    public @Test void packageBody_test()
    {
    CR cr = run("packageBody");
    assertEquals(CR.OK, cr);
    }  
}


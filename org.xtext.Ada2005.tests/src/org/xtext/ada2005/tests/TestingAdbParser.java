package org.xtext.ada2005.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.junit4.InjectWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.xtext.ada2005.AdbInjectorProvider;
import org.xtext.ada2005.AdbStandaloneSetup;
import org.xtext.ada2005.adb.Compilation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


@RunWith(value=XtextRunner.class)
@InjectWith(AdbInjectorProvider.class)


public class TestingAdbParser {
	
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
	
	static protected class FilterAdabodyFile implements FilenameFilter 
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
	private String runningTestName;
	
	public Compilation model = null;
	
	enum CR { OK, NOK, NOK2 };
	
	static
		{
		    files = new ArrayList<File>(Arrays.asList(new File("utest.acats.indata/A").listFiles(new FilterAdabodyFile())));
		    files.addAll(Arrays.asList(new File("utest.acats.indata/B2").listFiles(new FilterAdabodyFile())));
		    
		    filesIndexAssociations = new HashMap<String, Integer>(files.size());
		
		    for (int i = 0; i < files.size(); i++)
		    {
		    filesIndexAssociations.put(files.get(i).getName().replaceAll("\\.ADA.adb", ""), new Integer(i));
		    }
		
			AdbStandaloneSetup.doSetup();
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			resourceSet = AdbStandaloneSetup.injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
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
		}
    	
    	Resource resource2 = resourceSet.getResource(URI.createURI("utest.acats.indata\\support\\repspec.ada"), true);
    	Resource resource = resourceSet.getResource(URI.createURI(insourcefilename), true);

    	@SuppressWarnings("unused")
		Compilation model2 = (Compilation) resource2.getContents().get(0);
		model = (Compilation) resource.getContents().get(0);
		
		EList<Resource.Diagnostic> errors = resource.getErrors();	
		
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
		if (cr == CR.OK)
		{		   
		   File outsourcefile = new File(outdir, insourceFile.toPath().getFileName().toString());
		   PrintStream out = null;
			try {
				out = new PrintStream(outsourcefile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				e.printStackTrace(execution_errors_log);
				cr = CR.NOK2;
			}
		   try {
   			   resource.save(System.out, null);
   			   resource.save(out, null);
   			   out.close();
//   			   boolean identicals = FileUtils.contentEquals(insourceFile, outsourcefile);
//   			   if (!identicals)
//   			   {
//   				   execution_errors_log.println(insourceFile.getPath() + " and " + outsourcefile.getPath() +
//   						                        "differents.");
//   			   }
		       } 
		   catch (IOException e) 
		   {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   e.printStackTrace(execution_errors_log);
		   cr = CR.NOK2;
		   }
		   finally
		   {
			  out.close(); 
			  execution_errors_log.close();
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
		outdirpath = new File("utest.acats.indata").toPath().relativize(outdirpath);
		String outdirstring = "utest.acats.outdata/" + outdirpath.toString();		
		return new File(outdirstring +  "/" + runningTestName);
	}
    
    CR run(String argTestname)
    {
    	runningTestName = argTestname;
    	System.err.println();
    	System.err.println("------------------- " + runningTestName + "-------------------");
    	return run(filesIndexAssociations.get(argTestname));    	
    }
    
    public @Test void A22006B()
    {
    CR cr = run("A22006B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A22006C()
    {
    CR cr = run("A22006C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A22006D()
    {
    CR cr = run("A22006D");
    assertEquals(CR.OK, cr);
    }

    public @Test void A27003A()
    {
    CR cr = run("A27003A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A29003A()
    {
    CR cr = run("A29003A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A2A031A()
    {
    CR cr = run("A2A031A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A33003A()
    {
    CR cr = run("A33003A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A34017C()
    {
    CR cr = run("A34017C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A35101B()
    {
    CR cr = run("A35101B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A35402A()
    {
    CR cr = run("A35402A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A35801F()
    {
    CR cr = run("A35801F");
    assertEquals(CR.OK, cr);
    }

    public @Test void A35902C()
    {
    CR cr = run("A35902C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A38106D()
    {
    CR cr = run("A38106D");
    assertEquals(CR.OK, cr);
    }

    public @Test void A38106E()
    {
    CR cr = run("A38106E");
    assertEquals(CR.OK, cr);
    }

    public @Test void A49027A()
    {
    CR cr = run("A49027A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A49027B()
    {
    CR cr = run("A49027B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A49027C()
    {
    CR cr = run("A49027C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A54B01A()
    {
    CR cr = run("A54B01A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A54B02A()
    {
    CR cr = run("A54B02A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A55B12A()
    {
    CR cr = run("A55B12A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A55B13A()
    {
    CR cr = run("A55B13A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A55B14A()
    {
    CR cr = run("A55B14A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A71004A()
    {
    CR cr = run("A71004A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A73001I()
    {
    CR cr = run("A73001I");
    assertEquals(CR.OK, cr);
    }

    public @Test void A73001J()
    {
    CR cr = run("A73001J");
    assertEquals(CR.OK, cr);
    }

    public @Test void A74105B()
    {
    CR cr = run("A74105B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A74106A()
    {
    CR cr = run("A74106A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A74106B()
    {
    CR cr = run("A74106B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A74106C()
    {
    CR cr = run("A74106C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A74205E()
    {
    CR cr = run("A74205E");
    assertEquals(CR.OK, cr);
    }

    public @Test void A74205F()
    {
    CR cr = run("A74205F");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83009A()
    {
    CR cr = run("A83009A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83009B()
    {
    CR cr = run("A83009B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83A02A()
    {
    CR cr = run("A83A02A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83A02B()
    {
    CR cr = run("A83A02B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83A06A()
    {
    CR cr = run("A83A06A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83A08A()
    {
    CR cr = run("A83A08A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83C01C()
    {
    CR cr = run("A83C01C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83C01H()
    {
    CR cr = run("A83C01H");
    assertEquals(CR.OK, cr);
    }

    public @Test void A83C01I()
    {
    CR cr = run("A83C01I");
    assertEquals(CR.OK, cr);
    }

    public @Test void A85007D()
    {
    CR cr = run("A85007D");
    assertEquals(CR.OK, cr);
    }

    public @Test void A85013B()
    {
    CR cr = run("A85013B");
    assertEquals(CR.OK, cr);
    }

    public @Test void A87B59A()
    {
    CR cr = run("A87B59A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A95001C()
    {
    CR cr = run("A95001C");
    assertEquals(CR.OK, cr);
    }

    public @Test void A95074D()
    {
    CR cr = run("A95074D");
    assertEquals(CR.OK, cr);
    }

    public @Test void A97106A()
    {
    CR cr = run("A97106A");
    assertEquals(CR.OK, cr);
    }

    public @Test void A99006A()
    {
    CR cr = run("A99006A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AA2010A()
    {
    CR cr = run("AA2010A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AA2012A()
    {
    CR cr = run("AA2012A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AC1015B()
    {
    CR cr = run("AC1015B");
    assertEquals(CR.OK, cr);
    }

    public @Test void AC3106A()
    {
    CR cr = run("AC3106A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AC3206A()
    {
    CR cr = run("AC3206A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AC3207A()
    {
    CR cr = run("AC3207A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7001B()
    {
    CR cr = run("AD7001B");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7001C0()
    {
    CR cr = run("AD7001C0");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7001C1()
    {
    Resource resource = resourceSet.getResource(URI.createURI("utest.acats.indata\\A\\AD7001C0.ADA.adb"), true);
    @SuppressWarnings("unused")
	Compilation model = (Compilation) resource.getContents().get(0);	    	    	
    CR cr = run("AD7001C1");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7001D0()
    {
    CR cr = run("AD7001D0");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7001D1()
    {
    CR cr = run("AD7001D1");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7006A()
    {
    CR cr = run("AD7006A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7101A()
    {
    CR cr = run("AD7101A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7101C()
    {
    CR cr = run("AD7101C");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7102A()
    {
    CR cr = run("AD7102A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7103A()
    {
    CR cr = run("AD7103A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7103C()
    {
    CR cr = run("AD7103C");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7104A()
    {
    CR cr = run("AD7104A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7201A()
    {
    CR cr = run("AD7201A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7203B()
    {
    CR cr = run("AD7203B");
    assertEquals(CR.OK, cr);
    }

    public @Test void AD7205B()
    {
    CR cr = run("AD7205B");
    assertEquals(CR.OK, cr);
    }

    public @Test void ADA101A()
    {
    CR cr = run("ADA101A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AE2113A()
    {
    CR cr = run("AE2113A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AE2113B()
    {
    CR cr = run("AE2113B");
    assertEquals(CR.OK, cr);
    }

    public @Test void AE3002G()
    {
    CR cr = run("AE3002G");
    assertEquals(CR.OK, cr);
    }

    public @Test void AE3101A()
    {
    CR cr = run("AE3101A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AE3702A()
    {
    CR cr = run("AE3702A");
    assertEquals(CR.OK, cr);
    }

    public @Test void AE3709A()
    {
    CR cr = run("AE3709A"); 
    assertEquals(CR.OK, cr);
    }
    
    public @Test void B22001H()
    {
    CR cr = run("B22001H"); 
    assertEquals(CR.NOK, cr);
    }    
    
    public @Test void B23002A()
    {
    CR cr = run("B23002A"); 
    assertEquals(CR.NOK, cr);
    } 
    
    public @Test void labo()
    {
    CR cr = run("labo"); 
    assertEquals(CR.OK, cr);
    } 
}

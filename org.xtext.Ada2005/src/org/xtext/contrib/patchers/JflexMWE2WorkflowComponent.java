package org.xtext.contrib.patchers;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;


public class JflexMWE2WorkflowComponent implements IWorkflowComponent {

	private String outputDirectory, jflexFilename;
	
	public String getOutputDirectory() {
		return outputDirectory;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	public String getJflexFilename() {
		return jflexFilename;
	}

	public void setJflexFilename(String jflexFilename) {
		this.jflexFilename = jflexFilename;
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		// TODO Auto-generated method stub
	String params[] = {"--noinputstreamctor", "-d", getOutputDirectory(), getJflexFilename()};
	jflex.Main.main(params);
	}

	@Override
	public void preInvoke() {
		// TODO Auto-generated method stub
		
	}	
	
	@Override
	public void postInvoke() {
		// TODO Auto-generated method stub
		
	}

}

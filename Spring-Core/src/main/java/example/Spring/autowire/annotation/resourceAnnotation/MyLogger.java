package example.Spring.autowire.annotation.resourceAnnotation;

import javax.annotation.Resource;

public class MyLogger {
	
	
	@Resource(name="fileWriter")
	private MyFileWriter fileWriter;
	
	//use name property to remove any ambiguity
	@Resource(name="consoleWriterDup")
	private MyConsoleWriter consoleWriter;

	public void writeToFile(String text) {
		if(fileWriter == null) {
			return;
		}
		fileWriter.write(text);
	}


	public void writeToConsole(String text) {
		if(consoleWriter == null) {
			return;
		}
		consoleWriter.write(text);
	}

	
	

}

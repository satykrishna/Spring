package example.Spring.autowire.annotation.injectAnnotation;

import javax.inject.Inject;
import javax.inject.Named;

public class MyLogger {
	
	//Inject annotation is in javax.inject jar, see pom.xml for dependency details
	@Inject

	//To Avoid ambiguity with multiple 'MyFileWriter' Beans in spring-beans.xml
	//use Named annotation to choose the one that is to be injected
	
	@Named(value="fileWriterDup")
	private MyFileWriter fileWriter;
	
	@Inject
	@Named(value="consoleWriter")
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

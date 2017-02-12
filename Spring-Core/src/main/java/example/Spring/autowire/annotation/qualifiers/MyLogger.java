package example.Spring.autowire.annotation.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyLogger {
	
	
	@Autowired
	private MyFileWriter fileWriter;
	
	@Autowired
	//Qualifier is used to get the bean with 'qualifier' property from spring-config.xml
	@Qualifier("consoleWriterDuplicate")
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

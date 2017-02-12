package example.Spring.autowire.annotation.optional;

import org.springframework.beans.factory.annotation.Autowired;

public class MyLogger {
	
	
   //Autowired annotation can be placed in setters and getters instead of here.
	@Autowired
	private MyFileWriter fileWriter;
	
	@Autowired(required=false)
	private MyConsoleWriter consoleWriter;


	
	
	public void writeToFile(String text) {
		fileWriter.write(text);
	}

	public MyLogger() {
		super();
	}

	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}

	@Autowired
	public MyLogger(MyFileWriter fileWriter) {
		super();
		this.fileWriter = fileWriter;
	}
	
	@Autowired
	public void setConsoleWriter(MyConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	

}

package example.Spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MyLogger {
	
	
   //Autowired annotation can be placed in setters and getters instead of here.
	@Autowired
	private MyFileWriter fileWriter;
	
	@Autowired
	private MyConsoleWriter consoleWriter;


	
	
	public void writeToFile(String text) {
		fileWriter.write(text);
	}

	public MyLogger() {
		super();
	}

	
	@Autowired
	//Autowired can be placed on the constructors as well. As autowiring by constructors
	//are nothing but autowiring by type
	public MyLogger(MyFileWriter fileWriter, MyConsoleWriter consoleWriter) {
		super();
		this.fileWriter = fileWriter;
		this.consoleWriter = consoleWriter;
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

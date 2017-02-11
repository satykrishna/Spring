package example.Spring.autowire.byType;

public class MyLogger {

	/*
	 *
	 * /* Note that the below code doesn't work for autowiring by Type or
	 * autowiring by Constructor private MyLogWriter fileWriter;
	 * 
	 * private MyLogWriter consoleWriter;
	 * 
	 * public MyLogWriter getFileWriter() { return fileWriter; }
	 * 
	 * public void setFileWriter(MyLogWriter fileWriter) { this.fileWriter =
	 * fileWriter; }
	 * 
	 * public MyLogWriter getConsoleWriter() { return consoleWriter; }
	 * 
	 * public void setConsoleWriter(MyLogWriter consoleWriter) {
	 * this.consoleWriter = consoleWriter; }
	 */

	private MyFileWriter fileWriter;
	private MyConsoleWriter consoleWriter;

	public MyFileWriter getFilewriter() {
		return fileWriter;
	}

	public void setFilewriter(MyFileWriter filewriter) {
		this.fileWriter = filewriter;
	}

	public MyConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(MyConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void writeToFile(String text) {
		fileWriter.write(text);
	}

	public MyLogger(MyFileWriter fileWriter, MyConsoleWriter consoleWriter) {
		super();
		this.fileWriter = fileWriter;
		this.consoleWriter = consoleWriter;
	}

	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}
	
	
}

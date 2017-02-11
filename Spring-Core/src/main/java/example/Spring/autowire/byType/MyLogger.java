package example.Spring.autowire.byType;

public class MyLogger {

	
	private MyLogWriter fileWriter;
	
	private MyLogWriter consoleWriter;

	public MyLogWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(MyLogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public MyLogWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(MyLogWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	
	
/*	private MyFileWriter filewriter;
	private MyConsoleWriter consoleWriter;

	public MyFileWriter getFilewriter() {
		return filewriter;
	}

	public void setFilewriter(MyFileWriter filewriter) {
		this.filewriter = filewriter;
	}

	public MyConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(MyConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	
*/
	public void writeToFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeToConsole(String text) {
		consoleWriter.write(text);
	}
}

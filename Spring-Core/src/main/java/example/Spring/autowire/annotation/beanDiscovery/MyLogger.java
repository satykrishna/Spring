package example.Spring.autowire.annotation.beanDiscovery;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {
	
	@Resource(name="filewriter")
	private MyFileWriter fileWriter;
	
	 //we can use autowired or inject annotation
	@Resource(name="consolewriter")
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

package example.Spring.autowire.annotation.initDestroyMethods;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class MyLogger {

	private static Logger logger = Logger.getLogger(MyLogger.class.getName());
	
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
	
	
	@PostConstruct
	public void initialization() {
		logger.info("POST CONSTRUCT OF BEAN, THIS METHOD IS INITIALIZED");
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("THIS METHOD IS INVOKED BEFORE DESTROYING BEAN");
	}
	

}

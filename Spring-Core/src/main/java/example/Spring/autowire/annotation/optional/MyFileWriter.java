package example.Spring.autowire.annotation.optional;

import java.util.logging.Logger;

public class MyFileWriter implements MyLogWriter{

	private static Logger logger = Logger.getLogger(MyFileWriter.class.getName());
	
	public void write(String text) {
		logger.info("Writing to File:- " + text);
	}

}

package example.Spring.autowire.annotation;

import java.util.logging.Logger;

public class MyConsoleWriter implements MyLogWriter {

	private static Logger logger = Logger.getLogger(MyConsoleWriter.class.getName());

	public void write(String text) {
		logger.info("Writing to console : " + text);
	}

}

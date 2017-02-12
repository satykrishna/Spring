package example.Spring.autowire.annotation.injectAnnotation;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;


public class MyConsoleWriter implements MyLogWriter {

	private static Logger logger = Logger.getLogger(MyConsoleWriter.class.getName());

	public void write(String text) {
		logger.info("Writing to console : " + text);
	}

}

package example.Spring.autowire.annotation.beanDiscovery;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="consolewriter")
public class MyConsoleWriter implements MyLogWriter {

	private static Logger logger = Logger.getLogger(MyConsoleWriter.class.getName());

	public void write(String text) {
		logger.info("Writing to console : " + text);
	}

}

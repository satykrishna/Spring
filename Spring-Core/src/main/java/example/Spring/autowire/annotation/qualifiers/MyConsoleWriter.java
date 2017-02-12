package example.Spring.autowire.annotation.qualifiers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;


@Qualifier(value="consoleWriterDuplicate")
public class MyConsoleWriter implements MyLogWriter {

	private static Logger logger = Logger.getLogger(MyConsoleWriter.class.getName());

	public void write(String text) {
		logger.info("Writing to console : " + text);
	}

}

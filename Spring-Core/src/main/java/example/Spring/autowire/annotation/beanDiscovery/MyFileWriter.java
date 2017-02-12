package example.Spring.autowire.annotation.beanDiscovery;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component(value="filewriter")
public class MyFileWriter implements MyLogWriter{

	private static Logger logger = Logger.getLogger(MyFileWriter.class.getName());
	
	public void write(String text) {
		logger.info("Writing to File:- " + text);
	}

}

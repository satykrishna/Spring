package example.Spring.autowire.annotation.qualifiers;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Qualifier;


/*
 * This Qualifier attribute is what used. if spring-beans.xml specifies this qualifier
 * then autowiring will take place with respect to that bean whose qualifier value is
 * same as the qualifier value mentioned here
 */

@Qualifier(value="orginalFileWriter")

public class MyFileWriter implements MyLogWriter{

	private static Logger logger = Logger.getLogger(MyFileWriter.class.getName());
	
	public void write(String text) {
		logger.info("Writing to File:- " + text);
	}

}

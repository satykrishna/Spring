package example.Spring.autowire.annotation.resourceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("resourceAnnotation.xml");

		  MyLogger logger = (MyLogger)applicationContext.getBean(MyLogger.class);
		  
		  logger.writeToFile("FILE");
		  logger.writeToConsole("FILE");
		
		ClassPathXmlApplicationContext classPathXMLAppContext = (ClassPathXmlApplicationContext) applicationContext;
		classPathXMLAppContext.close();
	}

}

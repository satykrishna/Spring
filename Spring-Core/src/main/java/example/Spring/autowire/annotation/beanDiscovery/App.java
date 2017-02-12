package example.Spring.autowire.annotation.beanDiscovery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("annotationBeanDiscovery.xml");

		  MyLogger logger = (MyLogger)applicationContext.getBean(MyLogger.class);
		  
		  logger.writeToFile("FILE");
		  logger.writeToConsole("CONSOLE");
		
		ClassPathXmlApplicationContext classPathXMLAppContext = (ClassPathXmlApplicationContext) applicationContext;
		classPathXMLAppContext.close();
	}

}

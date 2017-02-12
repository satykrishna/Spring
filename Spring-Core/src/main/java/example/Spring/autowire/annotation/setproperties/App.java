package example.Spring.autowire.annotation.setproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("setPropertiesofBeanusingAnnotation.xml");

		Robot robot = (Robot)appContext.getBean("robo");
		
		robot.speak();
		
		ClassPathXmlApplicationContext classpathAppContext = (ClassPathXmlApplicationContext)appContext;
		classpathAppContext.close();
	}
	
}

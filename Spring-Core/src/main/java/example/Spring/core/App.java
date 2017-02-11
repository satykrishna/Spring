package example.Spring.core;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.Spring.autowire.byType.MyLogger;
import example.Spring.setListProperty.FruitListBasket;
import example.Spring.setListProperty.JungleUsingList;
import example.Spring.setMapProperty.JungleusingMap;

public class App {

	private static Logger logger = Logger.getLogger(App.class.getName());
	private static ApplicationContext applicationContext = null;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("autowiring-byConstructor-beans.xml");

		ClassPathXmlApplicationContext cpxmAC = (ClassPathXmlApplicationContext) applicationContext;

		autoWiringbyType();
		
		cpxmAC.close();
	}

	public static void dependencyInjectionExample(ApplicationContext applicationContext) {
		Person person = (Person) applicationContext.getBean("satya");
		logger.log(Level.INFO, "Person1: " + person.toString());
		person.speak();
	}

	public static void useFactoryMethod() {
		Person person = (Person) applicationContext.getBean("satya");
		logger.log(Level.INFO, "Person1: " + person.toString());
		person.speak();

		Person person2 = (Person) applicationContext.getBean("satya");
		logger.log(Level.INFO, "Person 2: " + person2.toString());
	}

	public static void useFactoryBean() {
		Person person = (Person) applicationContext.getBean("satya");
		logger.info(person.toString());
	}
	
	public static void usePNameSpace() {
		Person person = (Person)applicationContext.getBean("satyaUsingPNameSpace");
		logger.info(person.toString());
	}
	
	public static void setListPropertyofBean() {
		FruitListBasket basket = (FruitListBasket)applicationContext.getBean("fruitlist");
		logger.info(basket.toString());
		JungleUsingList jungle  = (JungleUsingList)applicationContext.getBean("jungle");
		logger.info(jungle.toString());
	}
	
	public static void setMapPropertyBean() {
		JungleusingMap jungle = (JungleusingMap)applicationContext.getBean("jungle");
		logger.info(jungle.toString());
	}
	
	public static void autoWiringbyType() {
		MyLogger logger = (MyLogger)applicationContext.getBean("myLogger");
		logger.writeToConsole("Write to Console");
		logger.writeToFile("Write to File");
	}
}

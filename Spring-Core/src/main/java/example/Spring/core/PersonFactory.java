package example.Spring.core;

import java.util.logging.Logger;

public class PersonFactory {

	private static Logger logger = Logger.getLogger(PersonFactory.class.getName());
	
	public Person createPerson(int id, String name) {
		logger.entering(this.getClass().getName(), "createPerson(int id, String name)");
		logger.info("createPerson(int, String)");
		return Person.getInstanceUsingFactoryMethod(id,name);
	}
	
	public Person createPerson() {
		logger.entering(this.getClass().getName(), "createPerson()");
		logger.info("createPerson()");
		return Person.getInstanceUsingFactoryMethod();
	}
	
	public Person createPerson(int id, String name, Address address) {
		logger.entering(this.getClass().getName(), "createPerson(int, String, Address)");
		logger.info("createPerson(int, String, Address)");
		return Person.getInstanceUsingFactoryMethod(id, address, name);
	}
	
}

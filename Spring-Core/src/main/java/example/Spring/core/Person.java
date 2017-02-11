package example.Spring.core;

import java.io.Serializable;
import java.util.logging.Logger;

public class Person implements Serializable {

	private static Logger logger = Logger.getLogger(Person.class.getName());
	
	private static final long serialVersionUID = 1L;

	private int id;

	private Address address;

	private static Person instance;
	
	private String name;

	public Person() {
		super();
	}

	private Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void speak() {
		logger.info("This " + this + " can speak");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Person(int id, Address address, String name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}
	
	public static Person getInstanceUsingFactoryMethod(int id, Address address, String name) {
		if(instance == null) {
			instance = new Person(id, address, name);
		}
		return instance;
	}

	public static Person getInstanceUsingFactoryMethod() {
		if(instance == null) {
			instance = new Person();
		}
		return instance;
	}
	
	public static Person getInstanceUsingFactoryMethod(int id, String name) {
		if(instance == null) {
			instance = new Person(id, name);
		}
		return instance;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Person [id=%s, address=%s, name=%s]", id, address, name);
	}

	public void onCreate() {
		logger.info("Initialization during the bean creation" + this);
	}
	
	public void onDestroy() {
		logger.warning("Destroy the bean that is created " + this);
	}

}

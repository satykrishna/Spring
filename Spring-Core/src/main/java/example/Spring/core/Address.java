package example.Spring.core;

import java.io.Serializable;
import java.util.logging.Logger;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(Address.class.getName());

	private String zipCode;
	private String street;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String zipCode, String street) {
		super();
		this.zipCode = zipCode;
		this.street = street;
	}

	@Override
	public String toString() {
		return String.format("Address [zipCode=%s, street=%s]", zipCode, street);
	}

	public Address() {
		super();
	}
	
	public void defaultInit() {
		logger.info("This is default init method for spring-beans.xml file");
	}
	
	public void defaultDestroy() {
		logger.info("This is default destroy method for spring-beans.xml file");
	}
	
	
	

}

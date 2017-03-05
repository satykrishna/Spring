package example.spring.aop.annotation.beanpcd;

import org.springframework.stereotype.Component;

@Component("carBean")
public class Car {
	
	public void start() {
		System.out.println("Start the car...");
	}

}

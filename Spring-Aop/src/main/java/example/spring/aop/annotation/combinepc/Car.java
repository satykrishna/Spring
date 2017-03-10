package example.spring.aop.annotation.combinepc;

import org.springframework.stereotype.Component;

@Component("carBean")
public class Car {
	
	@Deprecated
	public void start() {
		System.out.println("Start the car...");
	}

}

package example.spring.aop;

import org.springframework.stereotype.Component;

@Component(value="loggerBean")
public class Logger {

	public void aboutToTakePhoto() {
		System.out.println("About to take photo");
	}
	
	
}

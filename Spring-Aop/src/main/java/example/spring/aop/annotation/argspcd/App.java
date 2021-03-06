package example.spring.aop.annotation.argspcd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-annotation-argspcd.xml");
		
		ICamera camera = (ICamera)appContext.getBean("cameraBean");
		
		camera.snap();
		
		camera.snap(5000);
		
		camera.snapNightTime();
		
		Car car = (Car)appContext.getBean("carBean");
		
		car.start();
		
		camera.snapCar(car);	
		
		appContext.close();
	}

}

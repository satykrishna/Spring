package example.spring.aop.annotation.getargsUsingArgs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-annotation-getArgsusingArgs.xml");
		
		ICamera camera = (ICamera)appContext.getBean("cameraBean");
		
		camera.snap();
		
		camera.snap(5000);
		
		
		camera.snapNightTime();
		
		Car car = (Car)appContext.getBean("carBean");
		
		car.start();
		
		camera.snapCar(car);	
		
		camera.snap(1.8D);
		
		camera.snap(2, 1.8D);
		
		appContext.close();
	}

}

package example.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Camera camera = (Camera)appContext.getBean("cameraBean");
		
		camera.snap();
		
		appContext.close();
		
	}

}

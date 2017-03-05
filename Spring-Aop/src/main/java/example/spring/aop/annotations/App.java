package example.spring.aop.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-annotations.xml");
		
		Camera camera = (Camera)appContext.getBean("cameraBean");
		
		camera.snap();
		
		appContext.close();
		
	}

}

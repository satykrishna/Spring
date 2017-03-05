package example.spring.aop.wildcards;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-wildcards.xml");
		
		Camera camera = (Camera)appContext.getBean("cameraBean");
		
		/*camera.snap();
		
		camera.snap(1000);
		
		camera.snap("Satya");
		
		camera.snap(1000, "kondapalli");
		
		camera.snapNightTime();
		*/
		
		Lens lens = (Lens)appContext.getBean("lensBean");
		
		lens.zoom(2);
		
		appContext.close();
		
	}

}

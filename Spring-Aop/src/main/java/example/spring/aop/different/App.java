package example.spring.aop.different;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-different-pointcut.xml");
		
		Camera camera = (Camera)appContext.getBean("cameraBean");
		
		try {
			camera.snap();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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

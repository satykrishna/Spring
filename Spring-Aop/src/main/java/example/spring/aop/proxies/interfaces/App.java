package example.spring.aop.proxies.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-proxies-interfaces.xml");
		
		Object obj = appContext.getBean("cameraBean");
		
		System.out.println("Class of camera bean " + obj.getClass());
		
		System.out.println("Is instance of camera ? " + (obj instanceof Camera));
		
		System.out.println("Is instance of Photo snapper ?  " + (obj instanceof PhotoSnapper));
		
		ICamera camera = (ICamera)appContext.getBean("cameraBean");
		
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

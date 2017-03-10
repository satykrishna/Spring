package example.spring.aop.annotation.introductionsvalueadd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ClassPathXmlApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("spring-aop-annotation-introductions.xml");
		
		IBlender blender  = (IBlender) appContext.getBean("blenderBean");
		
		blender.blend();
		
		((IMachine)blender).start();
		
		
		IFan fan = (IFan) appContext.getBean("fanBean");
		
		((IMachine)fan).start();

		
		fan.activate(3);
		
		
		appContext.close();
	}

}

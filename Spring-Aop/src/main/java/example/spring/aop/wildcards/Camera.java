package example.spring.aop.wildcards;

import org.springframework.stereotype.Component;

@Component(value="cameraBean")
public class Camera {
	
	public void snap() {
		System.out.println("SNAP");
	}
	
	public void snap(int elapse) {
		System.out.println("SNAP AFTER " + elapse + " ms");
	}
	
	public void snap(String name) {
		System.out.println("SNAP Name : " + name);
	}
	
	public String snap(int elapse, String name) {
		System.out.println("SNAP !!! " + elapse + " , " + name);
		return name;
	}
	
	public void snapNightTime() {
		System.out.println("Snap!!! Night Mode");
	}
}

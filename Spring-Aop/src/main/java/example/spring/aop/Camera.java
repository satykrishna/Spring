package example.spring.aop;

import org.springframework.stereotype.Component;

@Component(value="cameraBean")
public class Camera {
	
	public void snap() {
		System.out.println("SNAP");
	}
}

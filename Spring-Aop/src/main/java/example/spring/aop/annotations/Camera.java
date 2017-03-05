package example.spring.aop.annotations;

import org.springframework.stereotype.Component;

@Component(value="cameraBean")
public class Camera {
	
	public void snap() {
		System.out.println("SNAP");
	}
}

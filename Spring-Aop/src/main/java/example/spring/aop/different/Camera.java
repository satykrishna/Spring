package example.spring.aop.different;

import org.springframework.stereotype.Component;

@Component(value="cameraBean")
public class Camera {
	
	public void snap() throws Exception {
		System.out.println("SNAP");
		throw new Exception();
	}
}
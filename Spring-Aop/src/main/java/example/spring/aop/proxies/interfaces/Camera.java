package example.spring.aop.proxies.interfaces;

import org.springframework.stereotype.Component;

@Component(value="cameraBean")
public class Camera implements PhotoSnapper, ICamera {
	
	public Camera() {
		System.out.println("Hello from Camera constructor");
	}	
	
	@Override
	public void snap() throws Exception {
		System.out.println("SNAP");
		throw new Exception();
	}
	
	@Override
	public String snap(String name) {
		System.out.println("Snap with name " + name);
		return name;
	}
	
	@Override
	public void snap(int exposure) {
		System.out.println("Snap with exposure : " + exposure);
	}
	
	@Override
	public void snapNightTime() {
		System.out.println("Snapping night time");
	}
}
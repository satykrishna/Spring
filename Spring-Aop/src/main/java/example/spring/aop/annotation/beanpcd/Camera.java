package example.spring.aop.annotation.beanpcd;

import org.springframework.stereotype.Component;

@Component(value = "cameraBean")
public class Camera implements ICamera {

	@Override
	public void snap() {
		System.out.println("SNAP");
	}

	@Override
	public void snap(int elapse) {
		System.out.println("SNAP AFTER " + elapse + " ms");
	}

	@Override
	public void snap(String name) {
		System.out.println("SNAP Name : " + name);
	}

	@Override
	public String snap(int elapse, String name) {
		System.out.println("SNAP !!! " + elapse + " , " + name);
		return name;
	}

	@Override
	public void snapNightTime() {
		System.out.println("Snap!!! Night Mode");
	}

	@Override
	public void snapCar(Car car) {

	}
}

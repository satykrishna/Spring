package example.spring.aop.annotation.pcd;

public interface ICamera {

	void snap();

	void snap(int elapse);

	void snap(String name);

	String snap(int elapse, String name);

	void snapNightTime();
	
	void snapCar(Car car);

}
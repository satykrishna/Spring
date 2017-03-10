package example.spring.aop.annotation.getTargetArgs;

public interface ICamera {

	void snap();

	void snap(int elapse);

	void snap(String name);

	String snap(int elapse, String name);

	void snapNightTime();
	
	void snapCar(Car car);
	
	void snap(int elapse, double variation);

	void snap(double variation);
}
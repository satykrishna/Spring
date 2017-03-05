package example.spring.aop.proxies.interfaces;

public interface ICamera {

	void snap() throws Exception;

	String snap(String name);

	void snap(int exposure);

	void snapNightTime();

}
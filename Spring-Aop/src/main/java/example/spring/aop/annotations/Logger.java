package example.spring.aop.annotations;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value="loggerBean")
public class Logger {
	
	@Pointcut("execution(void example.spring.aop.annotations.Camera.snap())")
	public void cameraSnap() {
		
	}

/*	@Before("execution(void example.spring.aop.annotations.Camera.snap())")
	public void aboutToTakePhoto() {
		System.out.println("About to take photo");
	}
	*/
	
	//another way
	@Before("cameraSnap()")
	public void aboutToTakePhoto() {
		System.out.println("About to take photo");
	}
	
}

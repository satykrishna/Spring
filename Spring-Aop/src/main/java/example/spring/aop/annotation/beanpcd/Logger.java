package example.spring.aop.annotation.beanpcd;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	//targets cameraBean defined in the pointcut
	@Pointcut("@bean(cameraBean)")
	public void cameraSnap() {
	}
	
	//targets all beans that end with cameraBean defined in the pointcut
	@Pointcut("@bean(*cameraBean)")
	public void cameraSnapWildCard() {
	}
	
	
	
	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Its a before advice");
	}

}

package example.spring.aop.annotation.getTargetArgs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	@Pointcut("target(example.spring.aop.annotation.getTargetArgs.Camera)")
	public void cameraSnap() {
		
	}
	
	@Before("cameraSnap()")
	public void beforeAdvice(JoinPoint jointPoint) {
		System.out.println("*** BEFORE ADVICE ***");
		
		for(Object object : jointPoint.getArgs()) {
			System.out.println("Arg " + object);
		}
	}
	
}
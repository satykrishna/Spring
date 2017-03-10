package example.spring.aop.annotation.getargsUsingArgs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	@Pointcut("args(elapse, variation)")
	public void cameraSnap(int elapse, double variation) {
		
	}
	
	@Before("cameraSnap(elapse, variation)")
	public void beforeAdvice(JoinPoint jointPoint, int elapse, double variation) {
		System.out.println("*** BEFORE ADVICE ***");
		
		for(Object object : jointPoint.getArgs()) {
			System.out.println("Arg " + object);
		}
	}
	
}
package example.spring.aop.annotation.combinepc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
	
	@Pointcut("target(example.spring.aop.annotation.combinepc.Camera)")
	public void targetCamera() {
		
	}
	
	@Before("targetCamera() && cameraSnap(elapse, variation)")
	public void beforeAdvice(JoinPoint jointPoint, int elapse, double variation) {
		System.out.println("*** BEFORE ADVICE ***");
		
		for(Object object : jointPoint.getArgs()) {
			System.out.println("Arg " + object);
		}
	}
	
	@After("within(example.spring.aop.annotation.combinepc.*) && @annotation(Deprecated)")
	public void afterAdvice() {
		System.out.println("After advice running!!!");
	}
	
}
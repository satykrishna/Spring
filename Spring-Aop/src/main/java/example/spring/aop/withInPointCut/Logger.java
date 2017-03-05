package example.spring.aop.withInPointCut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	@Pointcut("within(example.spring.aop.withInPointCut.*)")
	public void cameraSnap() {

	}
	
	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Its a before advice");
	}

	
}

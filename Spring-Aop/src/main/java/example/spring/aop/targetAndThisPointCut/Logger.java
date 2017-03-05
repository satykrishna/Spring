package example.spring.aop.targetAndThisPointCut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	@Pointcut("within(example.spring.aop.targetAndThisPointCut.*)")
	public void cameraSnap() {

	}
	
	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Its a before advice");
	}

	@Pointcut("target(example.spring.aop.targetAndThisPointCut.Camera)")
	public void targetSnap() {

	}
	
	//target is all about target class
	@Before("targetSnap()")
	public void targetSnapAdvice() {
		System.out.println("Its a before advice");
	}
	
	@Pointcut("this(example.spring.aop.targetAndThisPointCut.Camera)")
	public void thisSnap() {

	}
	
	//this is about instance of the bean that spring container is invoking.
	@Before("thisSnap()")
	public void thisSnapAdvice() {
		System.out.println("Its a before advice");
	}

}

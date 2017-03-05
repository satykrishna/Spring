package example.spring.aop.different;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	@Pointcut("execution(void example.spring.aop.different.Camera.snap())")
	public void cameraSnap() {

	}

	@Before("cameraSnap())")
	public void aboutToTakePhoto() {
		System.out.println("Before Advice");
	}

	@After("cameraSnap())")
	public void afterTakingPhoto() {
		System.out.println("After Advice");
	}

	@AfterReturning("cameraSnap())")
	public void afterReturningFromMethod() {
		System.out.println("After Returning Advice");
	}
	
	@AfterThrowing("cameraSnap())")
	public void afterThrowingAdvice () {
		System.out.println("After Throwing Advice");
	}

	@Around("cameraSnap())")
	public void aroundAdvice(ProceedingJoinPoint p) {
		System.out.println("Around  Advice: Before...");
		
		try {
			p.proceed();
		} catch (Throwable e) {
			System.out.println("In around advice: " +e.getMessage() );
		}
		
		System.out.println("Around Advice : After...");
	}


}

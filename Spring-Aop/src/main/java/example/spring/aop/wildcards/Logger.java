package example.spring.aop.wildcards;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	@Pointcut("execution(void example.spring.aop.wildcards.Camera.snap())")
	public void cameraSnap() {

	}
	
	@Pointcut("execution(void example.spring.aop.wildcards.Camera.*())")
	public void cameraSnapAnyMethod() {
		
	}

	@Pointcut("execution(* example.spring.aop.wildcards.*.*(..))")
	public void cameraRelatedAction() {
		
	}
	
	@Pointcut("execution(void example.spring.aop.wildcards.Camera.snap(..))")
	public void cameraSnapWithAnyArgument() {

	}

	@Pointcut("execution(void example.spring.aop.wildcards.Camera.snap(String))")
	public void cameraSnapWithName() {

	}

	@Pointcut("execution(* example.spring.aop.wildcards.*.*(..))")
	public void cameraSnapWithLens() {
		
	}
	
	@Pointcut("execution(String example.spring.aop.wildcards.Camera.snap(..))")
	public void cameraSnapWithNameAndReturnType() {

	}

	@Pointcut("execution(* example.spring.aop.annotations.Camera.snap())")
	public void cameraSnapWithWildCardReturnType() {
	}

	@Before("execution(void example.spring.aop.annotations.Camera.snap())")
	public void aboutToTakePhoto() {
		System.out.println("About to take photo");
	}

	// another way
	@Before("cameraSnapWithName()")
	public void aboutToTakePhotoWithName() {
		System.out.println("About to take photo with name");
	}

	// another way
	@Before("cameraSnapWithAnyArgument()")
	public void aboutToTakePhotoWithAnyArgument() {
		System.out.println("About to take photo with any argument");
	}

	// another way
	@Before("cameraSnapWithNameAndReturnType()")
	public void aboutToTakePhotoWithNameAndReturnType() {
		System.out.println("About to take photo with name and return type");
	}

	@Before("cameraSnapWithWildCardReturnType()")
	public void aboutToTakePhotoWithWildCardReturnType() {
		System.out.println("About to take photo with wild card return type");
	}

	@Before("cameraSnapWithLens()")
	public void anyMethod() {
		System.out.println("About to take photo with wild card return type in any method");
	}
	
	@Before("cameraRelatedAction()")
	public void about2DoCameraRelatedAction() {
		System.out.println("About to do camera related action");

	}

}

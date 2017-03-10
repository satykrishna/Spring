package example.spring.aop.annotation.argspcd;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	// match any method in container with no arguments.
	@Pointcut("args()")
	public void cameraSnap() {
	}

	// match any method in container with int argument.
	@Pointcut("args(int)")
	public void cameraSnapWithInt() {
	}

	// match any method in container with Car as argument.
	@Pointcut("args(example.spring.annotation.argspcd.Car)")
	public void cameraSnapWithCar() {
	}

	// match any method in container with int, double argument.
	@Pointcut("args(int, double)")
	public void cameraSnapWithIntAndDouble() {
	}

	// match any method in container with int, and any argument.
	@Pointcut("args(int, *)")
	public void cameraSnapWithIntAndWildCard() {
	}

	// match any method in container with int and zero or more argument.
	@Pointcut("args(int, ..)")
	public void cameraSnapWithIntAndAnyArgs() {

	}

	// match any method in container with int and zero or more argument.
	@Pointcut("args(.., int)")
	public void cameraSnapWithIntAndAnyArgsWildCard() {

	}

	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Its a before advice");
	}

}

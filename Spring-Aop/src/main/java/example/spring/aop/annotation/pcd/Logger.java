package example.spring.aop.annotation.pcd;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component(value = "loggerBean")
public class Logger {

	/*
	 * //runs on the classes with @Deprecated annotation defined on them
	 * 
	 * @Pointcut("within(@Deprecated example.spring.aop.annotation.pcd.*)")
	 * public void cameraSnap() {
	 * 
	 * }
	 */
	/*
	 * //runs on the classes with @Component annotation defined on them
	 * 
	 * @Pointcut("within(@org.springframework.stereotype.Component example.spring.aop.annotation.pcd.*)"
	 * ) public void componentSnap() {
	 * 
	 * }
	 */

	// runs on the targets classes with
	// @org.springframework.stereotype.Component annotation defined on them
	/*
	 * @Pointcut("@target(org.springframework.stereotype.Component)") public
	 * void cameraSnap() {
	 * 
	 * }
	 */
	
	
/*	// targets all deprecated methods with in our spring container
	@Pointcut("@annotation(java.lang.Deprecated)")
	public void cameraSnap() {

	}

	*/
	
	
	// targets all  methods that has arguments and defined in @component annotation with in our spring container
	@Pointcut("@args(org.springframework.stereotype.Component)")
	public void cameraSnap() {
	}

	
	
	@Before("cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Its a before advice");
	}

}

package example.spring.aop.annotation.introductionsvalueadd;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("loggerBean")
public class Logger {

	@DeclareParents(value="example.spring.aop.annotation.introductionsvalueadd.*", defaultImpl=example.spring.aop.annotation.introductionsvalueadd.Machine.class)
	private IMachine iMachine;
	
	@Pointcut("within(example.spring.aop.annotation.introductionsvalueadd.*)")
	public void definePointCut(){
		
	}
	
	@Around("definePointCut()")
	public void runMachine(ProceedingJoinPoint jointPoint) {
		System.out.println("Running....");
		
		try {
			jointPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("... completed");
	}
}

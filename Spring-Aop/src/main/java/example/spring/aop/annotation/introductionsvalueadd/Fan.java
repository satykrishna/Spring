package example.spring.aop.annotation.introductionsvalueadd;

import org.springframework.stereotype.Component;

@Component("fanBean")
public class Fan implements IFan {

	/* (non-Javadoc)
	 * @see example.spring.aop.annotation.introductionsvalueadd.IFan#activate(int)
	 */
	@Override
	public void activate(int level) {
		System.out.println("fan is activated at " + level + " level");
	}
	
}

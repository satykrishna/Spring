package example.spring.aop.annotation.introductionsvalueadd;

import org.springframework.stereotype.Component;

@Component("blenderBean")
public class Blender implements IBlender {
	
	/* (non-Javadoc)
	 * @see example.spring.aop.annotation.introductionsvalueadd.IBlender#blend()
	 */
	@Override
	public void blend() {
		System.out.println("Blender blends");
	}

}

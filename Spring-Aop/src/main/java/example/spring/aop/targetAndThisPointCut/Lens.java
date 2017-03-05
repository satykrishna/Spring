package example.spring.aop.targetAndThisPointCut;

import org.springframework.stereotype.Component;

@Component(value="lensBean")
public class Lens {

	public void zoom(int factor) {
		System.out.println("Zooming lens : " + factor);
	}
}

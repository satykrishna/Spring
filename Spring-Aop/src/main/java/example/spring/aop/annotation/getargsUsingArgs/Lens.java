package example.spring.aop.annotation.getargsUsingArgs;

import org.springframework.stereotype.Component;

@Component(value="lensBean")
public class Lens {

	public void zoom(int factor) {
		System.out.println("Zooming lens : " + factor);
	}
}

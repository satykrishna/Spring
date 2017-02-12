package example.Spring.autowire.spel.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component(value="randomText")
public class RandomText {

	private static String[] texts = new String[] { "I will be back", "Get Out",
			"I want your clothes, motorbike and boots", null };

	public String getText() {

		Random random = new Random();

		return texts[random.nextInt(texts.length)];
	}

}

package example.Spring.autowire.spel;

import java.util.Random;

public class RandomText {

	private static String[] texts = new String[] { "I will be back", "Get Out",
			"I want your clothes, motorbike and boots", null };

	public String getText() {

		Random random = new Random();

		return texts[random.nextInt(texts.length)];
	}

}

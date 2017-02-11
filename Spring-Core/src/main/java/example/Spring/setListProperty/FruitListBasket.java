package example.Spring.setListProperty;

import java.util.List;

public class FruitListBasket {

	private String name;
	private List<String> fruits;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFruits() {
		return fruits;
	}

	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	public FruitListBasket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FruitListBasket(String name, List<String> fruits) {
		super();
		this.name = name;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		return String.format("FruitListBasket [name=%s, fruits=%s]", name, fruits);
	}

}

package example.Spring.setMapProperty;

import java.util.HashMap;
import java.util.Map;

import example.Spring.setListProperty.Animal;

public class JungleusingMap {

	private Map<String, String> foods = new HashMap<String, String>();

	private Map<String, Animal> animals = new HashMap<String, Animal>();

	public Map<String, String> getFoods() {
		return foods;
	}

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JungleusingMap [foods=");
		builder.append(foods);
		builder.append(", animals=");
		builder.append(animals);
		builder.append("]");
		return builder.toString();
	}

	public Map<String, Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

}

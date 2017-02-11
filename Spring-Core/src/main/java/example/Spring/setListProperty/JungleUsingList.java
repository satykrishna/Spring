package example.Spring.setListProperty;

import java.util.List;

public class JungleUsingList {

	private List<Animal> animals;
	private Animal largestAnimal;

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Animal getLargestAnimal() {
		return largestAnimal;
	}

	public void setLargestAnimal(Animal largestAnimal) {
		this.largestAnimal = largestAnimal;
	}

	@Override
	public String toString() {
		return String.format("JungleUsingList [animals=%s, largestAnimal=%s]", animals, largestAnimal);
	}

}

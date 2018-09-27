package p1Inheritance;

public class Dog extends Pet {

	private String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

//	public String getName() {
//		return "Whatever name";
//	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog:\n\t" + super.toString() + ", breed=" + breed;
	}

}

package classWork;

public class Main {

	public static void main(String[] args) {

		Animal[] animals = { new Dog(), new Cat(), new Cat(), new Cat(), new Dog(), new Cat() };

		for (Animal animal : animals) {
			animal.voice();
			animal.feed();
			System.out.println();
		}

	}

}

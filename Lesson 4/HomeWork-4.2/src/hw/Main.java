package hw;

public class Main {

	public static void main(String[] args) {


		Dog dog1 = new Dog("Jack", DogBreed.LABRADOR, 2);
		Dog dog2 = new Dog("Jack2", DogBreed.POODLE, 6);
		Dog dog3 = new Dog("Jack", DogBreed.MOPS, 6);
		
		Dog dogs [] = {dog1, dog2, dog3};
		
		
		//Checking if we have dogs with same name
		
		int count = 0; // q-ty of dogs with same name
		int i = 0; // 
		String dogCurrentName = "";
		String dogSameName = "";
		
		for (Dog dog : dogs) {
			dogCurrentName = dog.getName();
			i = 0;
			
			for (Dog dogN : dogs) {
				if (dogCurrentName.equals(dogN.getName())) {
					i++;
				}	
			}
			
			if (i>1) {
				count ++;
				dogSameName = dogCurrentName;
			}
		}
		
		if (count > 1) {
			System.out.println("We have " + count + " dogs with the same name - " + dogSameName + "!");		
		} else {
			System.out.println("There are no dogs with the same name!");
		}
		
		
		// Looking for the oldest dog
		
		int maxAge = 0;
		
		for (Dog dog : dogs) {
			if (dog.getAge() > maxAge) {
				maxAge = dog.getAge();
			}
		}
		
		for (Dog dog : dogs) {
			if(dog.getAge() == maxAge) {
				System.out.println("The oldest dog - "+ dog.getBreed() + " " + dog.getName() + " is " + maxAge + " years old");
			}
		}

		
	}

}

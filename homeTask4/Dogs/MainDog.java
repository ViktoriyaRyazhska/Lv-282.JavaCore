package hw4;

public class MainDog {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[4];
		
		dog[0] = new Dog("Archi", Breed.Bulldog, 11);
		dog[1] = new Dog("Barsic", Breed.Collie, 7);
		dog[2] = new Dog("Cocker", Breed.Terrier, 3);
	    dog[3] = new Dog("Dorry", Breed.Foxhound, 12);
		
	    Dog.isSameName(dog);
	    
		System.out.println(dog[1].getBreed());
		
		System.out.println("The oldest god " + dog[Dog.oldest(dog)].getName() + " and his kind is " + dog[Dog.oldest(dog)].getBreed() );
		
	}

}

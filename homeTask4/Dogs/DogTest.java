package hw4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	Dog[] dog = new Dog[4];
	
	@Test
	public void testOldestDogFirst() {
		
		dog[0] = new Dog("Archi", Breed.Bulldog, 11);
		dog[1] = new Dog("Barsic", Breed.Collie, 7);
		dog[2] = new Dog("Cocker", Breed.Terrier, 3);
		dog[3] = new Dog("Dorry", Breed.Foxhound, 10);
		
		assertEquals(0, Dog.oldest(dog));
	}

	@Test
	public void testOldestDogMiddle() {
		
		dog[0] = new Dog("Archi", Breed.Bulldog, 11);
		dog[1] = new Dog("Barsic", Breed.Collie, 17);
		dog[2] = new Dog("Cocker", Breed.Terrier, 3);
		dog[3] = new Dog("Dorry", Breed.Foxhound, 10);
		
		assertEquals(1, Dog.oldest(dog));
	}
	
	@Test
	public void testOldestDogLast() {
		
		dog[0] = new Dog("Archi", Breed.Bulldog, 11);
		dog[1] = new Dog("Barsic", Breed.Collie, 17);
		dog[2] = new Dog("Cocker", Breed.Terrier, 3);
		dog[3] = new Dog("Dorry", Breed.Foxhound, 21);
		
		assertEquals(3, Dog.oldest(dog));
	}
	
	@Test
	public void testSameNameTrue() {
		
		dog[0] = new Dog("Archi", Breed.Bulldog, 11);
		dog[1] = new Dog("Barsic", Breed.Collie, 17);
		dog[2] = new Dog("Archi", Breed.Terrier, 3);
		dog[3] = new Dog("Dorry", Breed.Foxhound, 21);
		
		assertTrue(Dog.isSameName(dog));
	}

	@Test
	public void testSameNameFalse() {
		
		dog[0] = new Dog("Archi", Breed.Bulldog, 11);
		dog[1] = new Dog("Barsic", Breed.Collie, 17);
		dog[2] = new Dog("Candy", Breed.Terrier, 3);
		dog[3] = new Dog("Dorry", Breed.Foxhound, 21);
		
		assertFalse(Dog.isSameName(dog));
	}
}



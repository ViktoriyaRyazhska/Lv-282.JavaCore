package Ñreate_Dog;

import static org.junit.Assert.*;

import org.junit.Test;

public class dogTest {
	dog[] Dog=new dog[4];
	Breed breed;
	

	@Test
	public void testPrintArray() {
		Dog [0]= new dog("tuzic",breed=Breed.Bulldog,4);
		Dog [1]= new dog("zapik",breed=Breed.Hound,7);
		Dog [2]= new dog("hreta",breed=Breed.Foxhound,2);
		Dog [3]= new dog("tuzicc",breed=Breed.Terrier,8);
		
		
		assertEquals(0, Dog.equals(Dog));
		
	}
	@Test
	public void testPrintArray1() {
		Dog [0]= new dog("tuzic",breed=Breed.Bulldog,4);
		Dog [1]= new dog("zapik",breed=Breed.Hound,7);
		Dog [2]= new dog("hreta",breed=Breed.Foxhound,2);
		Dog [3]= new dog("tuzicc",breed=Breed.Terrier,8);
		
		
		assertEquals(1, Dog.equals(Dog));
		
	}
	@Test
	public void testThe_name_and_the_kind() {
		Dog [0]= new dog("tuzic",breed=Breed.Bulldog,4);
		Dog [1]= new dog("zapik",breed=Breed.Hound,7);
		Dog [2]= new dog("hreta",breed=Breed.Foxhound,2);
		Dog [3]= new dog("tuzicc",breed=Breed.Terrier,8);
		assertTrue(Dog.getClass().isArray());
		
	}
	@Test
	public void testThe_name_and_the_kind2() {
		Dog [0]= new dog("tuzic",breed=Breed.Bulldog,4);
		Dog [1]= new dog("zapik",breed=Breed.Hound,7);
		Dog [2]= new dog("hreta",breed=Breed.Foxhound,2);
		Dog [3]= new dog("tuzicc",breed=Breed.Terrier,8);
		assertFalse(Dog.getClass().isArray());
		
	}

}

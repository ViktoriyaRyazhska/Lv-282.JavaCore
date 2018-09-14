package conditionalHome4;

public class conditionalHome4 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Nick", "Dvorniaga", 5);
		Dog dog1 = new Dog("Tomas", "breed.Hasky", 2);
		Dog dog2 = new Dog("Nick", "breed.Vivcharka", 3);
       
		
		if (dog.getAge() > dog1.getAge() && dog.getAge() > dog2.getAge()) {
			System.out.println("найстарший собака " + dog);
		}
		if (dog1.getAge() > dog.getAge() && dog1.getAge() > dog2.getAge()) {
			System.out.println("найстарший собака " + dog1);
		}
		if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog.getAge()) {
			System.out.println("найстарший собака " + dog2);
		}
		
		if(dog.equals(dog2) && dog.equals(dog1) ){
			System.out.println("Імена різні");
			}
		if(dog1.equals(dog) && dog1.equals(dog2) ){
			System.out.println("Імена різні");
				}
		if(dog2.equals(dog) && dog2.equals(dog1) ){
			System.out.println("Імена різні");	
				}
	}
}

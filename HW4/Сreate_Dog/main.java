package Ñreate_Dog;

public class main {

	public static void main(String[] args) {
		Breed breed;
		dog[] Dog= new dog[4];
		
		Dog [0]= new dog("tuzic",breed=Breed.Bulldog,4);
		Dog [1]= new dog("zapik",breed=Breed.Hound,7);
		Dog [2]= new dog("hreta",breed=Breed.Foxhound,2);
		Dog [3]= new dog("tuzicc",breed=Breed.Terrier,8);
		
		dog.printArray(Dog);
		dog.the_name_and_the_kind(Dog);

}
}


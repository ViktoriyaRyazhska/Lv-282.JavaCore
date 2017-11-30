public class Dog {
	
	private String name;
	private Enum breed;
	private int age;
	
	public Dog() {
	}
	public Dog(String name, Enum breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enum getBreed() {
		return breed;
	}
	public void setBreed(Enum breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static boolean isSameName (Dog[] dog) {
		
		for (int i = 0; i < dog.length - 1; i++) {
			for (int j = i+1; j < dog.length; j++) {
				if(dog[i].getName() == dog[j].getName())
					return true;
			}
		}
		return false;
	}
	
	public static Dog oldestDog (Dog[] dog) {
		
		int max, index = 0;
		max = dog[0].getAge();
		for (int i = 0; i < dog.length; i++) {
			if(dog[i].getAge() > max) {
				max = dog[i].getAge();
				index = i;
			}
		}
		return dog[index];
	}
}

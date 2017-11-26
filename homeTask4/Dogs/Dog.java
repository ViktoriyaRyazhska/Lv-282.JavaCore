package hw4;

enum Breed {Bulldog, Foxhound, Terrier, Hound, Collie, Unknown}

public class Dog {

	private String name;
	private Breed breed;
	private int age;
	
	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Breed getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public static boolean isSameName(Dog[] dogs) {
		
		String name1, name2;
		
		for (int i = 0; i < dogs.length - 1; i++) {
			for (int j = i + 1; j < dogs.length; j++) {
				name1 = dogs[i].getName().toLowerCase();
				name2 = dogs[j].getName().toLowerCase();
				
				if (name1.equals(name2)) {
					System.out.println("Dodgs have same name");
					return true;
				}
			}
		}
		System.out.println("Dodgs have different name");
		return false;
	}
	
	public static int oldest(Dog[] dogs) {
		
		int index = 0;
		
		for (int i = 1; i < dogs.length; i++) {
			index = (dogs[i].getAge() > dogs[index].getAge()) ? i : (index);
		}
		
		return index;
	}  
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

}

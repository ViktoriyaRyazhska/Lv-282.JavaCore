package Ñreate_Dog;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class dog {
	
	private String name;
	private Breed breed;
	private int age;
	
	
	public dog() {
	}
	public dog(String name, Breed breed, int age) {
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
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dog other = (dog) obj;
		if (age != other.age)
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	
	
	public static boolean printArray(dog[] Dog) {
		String name1,name2;
		
		  for (int i = 0; i < Dog.length; i++) {
//		    System.out.println(Dog[i] + " ");
		    name1=Dog[i].getName().toLowerCase();
		   
		  
		   for (int j = 0; j < Dog.length; j++) {			   
			    name2=Dog[j].getName().toLowerCase();
			    
			   if(name1.equals(name2)) {
				   System.out.println("We have 2 names");
				   return true;
			   }
			
		}
		  }
		  System.out.println("We dont have 2 names");
		  return false;
		}
	
	
	public static void the_name_and_the_kind (dog[] Dog) {
		int max=0;
		String name2 = null;
		
		for (int i = 0; i < Dog.length; i++) {
			if (max < Dog[i].getAge())
				max = Dog[i].getAge();
			    name2=Dog[i].getName().toLowerCase();
		}
		System.out.print("age-"+max+"; ");
		System.out.println("Name-"+name2);
			}
		
		
	}
	
	
	



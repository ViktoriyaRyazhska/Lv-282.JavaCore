package Interface_Animal;

public class Main {

	public static void main(String[] args) {
		Animal[] animals=new Animal[8];
		animals[0]=new Dog("Chapik", "hav-hav", "zhapik");
		animals[1]=new Cat("fiona", "may-may", "wiskas");
		animals[2]=new Dog("Rex", "hav-hav", "zhapik");
		animals[3]=new Dog("Hreta", "hav-hav", "zhapik");
		animals[4]=new Cat("Miki", "may-may", "wiskas");
		animals[5]=new Dog("Aza", "hav-hav", "zhapik");
		animals[6]=new Dog("zapik", "hav-hav", "zhapik-turbo");
		animals[7]=new Cat("Barsik", "may-may", "wiskas-lite");
		
		for (Animal animal : animals) {
			System.out.println(animal.getClass().getSimpleName()+" "
					+ ""+animal.voice()+" "
							+ ""+animal.feed());
			
			
		}

	}

}

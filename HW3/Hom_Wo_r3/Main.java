package Hom_Wo_r3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException,NumberFormatException {
		Person per_0= new Person();
		Person per_1= new Person("Володя",1985);
		Person per_2= new Person("Василь",1980);
		Person per_3= new Person("Олег",1979);
		Person per_4= new Person("Іра",1987);
		Person per_5= new Person("Оля",1975);
		
	
Object [] mas= {per_1,per_2,per_3,per_4,per_5};
	for (Object object : mas) {
		System.out.println(object.toString());
		
		}

	
	//input - to input information about person
	//output - to output information about person

		per_0.input_Person(); 
		System.out.println(per_0.output_Person());
		
		
		//to change the name of person

		per_0.changeName();
		System.out.println(per_0.output_Person());
		
		
	}
	}



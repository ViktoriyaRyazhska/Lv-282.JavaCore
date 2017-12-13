package lesson9.pr2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		List<Plant> plants = new ArrayList<Plant>();
		
		
		try {
			plants.add(new Plant("rose", "red", 1));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		try {
			plants.add(new Plant("tulip", "greey", 3));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		try {
			plants.add(new Plant("gorobyna", "white", 5));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		try {
			plants.add(new Plant("rose", "blue", 11));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		
		try {
			plants.add(new Plant("georgina", "green", 12));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		for(Plant plant: plants) {
			System.out.println( "Normal input: " + plant.toString());
		}
		
		
	}

}


//Create a class Plants, 
//which includes fields int size,
//Color color and Type type, 
//and constructor where these fields are initialized.
//Color and type are Enum. 
//Override the method toString( ).
//Create classes ColorException and TypeException and describe there all possible colors and types of plants. 
//In the method main create an array of five plants. Check to work your exceptions.



//
//4.
//public static void main(String[] args) {
//   try {
//      Plant pl = new Plant("rose", "blue", 5);
//      System.out.println(pl);
//   } catch (ColorException | TypeException e) {
//      System.err.println(e.getMessage() + "\n");
//      //e.printStackTrace();
//   }
//}

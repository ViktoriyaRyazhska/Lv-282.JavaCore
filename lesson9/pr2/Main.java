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
			System.out.println(e.toString());
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



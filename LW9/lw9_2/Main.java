package lw9_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Plants> plants = new ArrayList<Plants>();
		
		try {
			plants.add(new Plants("rose", "red", 1));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		try {
			plants.add(new Plants("tulip", "greey", 3));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		try {
			plants.add(new Plants("rose", "yellow", 5));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		try {
			plants.add(new Plants("rose", "blue", 11));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.out.println(e.toString());
		}
		
		
		try {
			plants.add(new Plants("georgina", "green", 12));
		} catch (ColorException e) {
			System.out.println(e.toString());
		} catch (TypeException e) {
			System.err.println(e.toString());
		}
		
		for(Plants plant: plants) {
			System.out.println( "Normal input: " + plant.toString());
		}
		
		
}

	}



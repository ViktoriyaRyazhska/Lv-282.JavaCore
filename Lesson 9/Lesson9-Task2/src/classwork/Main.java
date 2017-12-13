/*
 * Create a class Plants, which includes fields int size, Color color and Type type, 
 * and constructor where these fields are initialized. 
 * Color and type are Enum. 
 * Override the method toString( ). 
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants. 
 * In the method main create an array of five plants. 
 * Check to work your exceptions.
 */

package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static int count = 1;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Plants> list = new ArrayList<Plants>();

		while (count <= 5) {
			System.out.println("Flower " + count);

			int diameter = readDiameter(br);
			int flag = 0;

			while (flag == 0) { //if we have 
				String type = readType(br);
				String color = readColor(br);
				try {
					list.add(new Plants(diameter, type, color));
					flag++;
				} catch (TypeException e) {
					System.err.println(e.getMessage());
				} catch (ColorException e) {
					System.err.println(e.getMessage());
				}
			}

			count++;
		}
		System.out.println(list);
	}

	public static int readDiameter(BufferedReader br) throws IOException {
		while (true) {
			System.out.println("Input diameter for flower " + count);
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.err.println("Invalid format for diameter");
			}
		}
	}

	public static String readType(BufferedReader br) throws IOException {
		System.out.println("Input type of flower " + count + " (Rose, Tulip, Pion, Orchid, Iris, Lily)");
		return br.readLine();
	}

	public static String readColor(BufferedReader br) throws IOException {
		System.out.println("Input color of flower " + count + " (blue, red, white or yellow)");
		return br.readLine();
	}

}

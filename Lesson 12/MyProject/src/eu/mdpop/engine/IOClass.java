/*
 * Package with service Classes 
 */

package eu.mdpop.engine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import eu.mdpop.projects.*;

/**
 * Input-Output Class. Class has all methods for input, reading and writing
 * data.
 * 
 * @author VR
 * @version 1.0
 * @since 19.12.2017
 *
 * 
 */

public class IOClass {

	private static FileWriter fw = null;
	private static BufferedWriter bw = null;

	private static FileReader fr = null;
	private static BufferedReader br = null;

	/**
	 * method to read Integer value from console. If it will be not correct data -
	 * value = 0;
	 * 
	 * @return int value, read from console.
	 */
	public static int readIntValue() {
		br = new BufferedReader(new InputStreamReader(System.in));

		int val = 0;
		try {
			val = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			System.out.println("You should input integer value!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return val;
	}

	/**
	 * method to read String value from console. If it will be not correct data -
	 * value = "";
	 * 
	 * @return String value, read from console.
	 */
	public static String readStringValue() {
		br = new BufferedReader(new InputStreamReader(System.in));
		String text = "";
		try {
			text = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}

	/**
	 * Not finished...
	 * 
	 * @return
	 */
	public static Project readFromFile() {
		Project project = new Project();

		return project;
	}

	/**
	 * Method to write data to file.
	 * 
	 * @param data
	 *            - prepared information to write in file
	 * @param fileName
	 *            - file of Project
	 * @throws FileNotEmptyException
	 */
	public static void writeToFile(String data, int projectNumber) throws FileNotEmptyException {

		String fileName = projectNumber + ".txt";
		String filenameInFolder = "Project/" + fileName;

	//	checkFile(filenameInFolder);

		try {
			fw = new FileWriter(filenameInFolder, true);
			bw = new BufferedWriter(fw);

			bw.write(data);
			bw.newLine();

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Not finished...
	 * 
	 * @param projectNumber
	 * @return
	 * @throws FileNotEmptyException
	 */
	private static boolean checkFile(String fileName) throws FileNotEmptyException {

//		String fileName = projectNumber + ".txt";

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			int count = 0;
			try {
				while (br.readLine() != null) {
					System.out.println(br.readLine());
					count++;
				}
				if (count == 0) {
					throw new FileNotEmptyException();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return true;

		} catch (FileNotFoundException e) {
			System.out.println(e.getClass().getSimpleName());
			System.out.println("It will be created a new file!");
			return false;
		}
	}

}

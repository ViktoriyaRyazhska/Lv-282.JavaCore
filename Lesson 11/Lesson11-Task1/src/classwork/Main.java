package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		int countCharacters = 0;
		String testWord = null;
		String character = "";
		BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
		System.out.println("Input word");
		try {
			testWord = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Input character");
		try {
			character = br.readLine().substring(0, 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String currentChar;
		for (int i = 0; i < testWord.length(); i++) {
			currentChar = testWord.substring(i, i+1);
		    if (character.equals(currentChar)) countCharacters++;
		}
		System.out.println("There are character " + character + " " + countCharacters + " times in the word " + testWord);
	}
}
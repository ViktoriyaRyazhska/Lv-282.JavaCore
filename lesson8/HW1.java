package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HW1 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a sentense");
		String text = br.readLine();
		
		List<String> words = new ArrayList<String>();
			
		words = Arrays.asList(text.split(" +"));
		StringBuilder secondWords = new StringBuilder(words.get(1));
		
		words.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});
		
		Iterator<String> iterator = words.iterator();
		System.out.print("Bigest words: ");
		while(iterator.hasNext()) {
			String word = iterator.next();
			if (word.length() < words.get(0).length()) {
				break;
			}
			System.out.print(word + "  ");
		}
	
		System.out.println("\nnumber of letters are:  " + text.replace(" ", "").length());
		System.out.println("second word in reverce order:  " + secondWords.reverse());
		
		
	}

}


//Enter in the console sentence of five words. 
//display the longest word in the sentence
//determine the number of its letters
//bring the second word in reverse order

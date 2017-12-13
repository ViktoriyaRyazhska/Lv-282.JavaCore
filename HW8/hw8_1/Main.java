package hw8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter 1 word");
		String word1 = br.readLine();
		System.out.println("Enter 2 word");
		String word2 = br.readLine();
		System.out.println("Enter 3 word");
		String word3 = br.readLine();
		System.out.println("Enter 4 word");
		String word4 = br.readLine();
		System.out.println("Enter 5 word");
		String word5 = br.readLine();
		
		
		String[] words= {word1,word2,word3,word4,word5};
		System.out.println("words: " + Arrays.toString(words));
		

		

			Arrays.sort(words,new Comparator<String>(){
			 
				public int compare(String s1,String s2){
			    
				  return s1.length() - s2.length();
			    }
			    });
		
			System.out.println();
			System.out.println("words: " + Arrays.toString(words));
			
			String[]words2=(Arrays.toString(words)).split(" ");
			//display the longest word in the sentence

			System.out.println("Bigest words: "+words2[4]);
			
			//determine the number of its letters			
			System.out.println("number of letters are:  "+words2[4].length());
			
			//the second word in reverse order
			StringBuilder secondWords = new StringBuilder(words2[1]);
			System.out.println("the second word in reverse order = "+secondWords.reverse());
			
		

	
	}}
	


			
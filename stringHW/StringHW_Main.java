package stringHW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringHW_Main {


	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			 
			//Sentence.FiveSentence(in.readLine());
			Sentence.Dollar(in.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

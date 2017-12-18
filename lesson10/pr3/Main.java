package lesson10.pr3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			
		List<String> listLine = new ArrayList<String>();
		List<Integer> lenghtOfLine = new ArrayList<Integer>();
		
		String line;
		
		BufferedReader br = null;
		
		try {
			br =  new BufferedReader(new FileReader("text.txt"));
			while ((line = br.readLine()) != null) {
				listLine.add(line);
				lenghtOfLine.add(line.length());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		
		listLine.sort(new Comparator<String>() {
	
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		}); 
		
		System.out.println("Number of symbol in every line:");
		for (int n: lenghtOfLine) {
			System.out.print(n + "  ");
		}
		
		System.out.println("\n\nLongest line:");
		System.out.println(listLine.get(listLine.size() - 1));
		
		System.out.println("\nShortest line:");
		System.out.println(listLine.get(0));
		
		String searchedText = "ð³ã";
		System.out.println("\nLine which contain " + searchedText + ":");
		
		for (String textInline: listLine) {
			if (textInline.contains(searchedText)) {
				System.out.println(textInline);
			}
		}
	}
}



// Prepare mytext.txt file with a lot of text inside.
// Read context from file into array of strings.
// Each array item contains one line from file.
// Complete next tasks:
// 1) count and write the number of symbols in every line.
// 2) find the longest and the shortest line.
// 3) find and write only that lines, which consist of word «var»

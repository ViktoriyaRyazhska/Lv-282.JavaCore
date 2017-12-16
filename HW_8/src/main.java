import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		String longestWord = new String();

		
		System.out.println("Enter sentence: ");
		str = br.readLine();
		
		longestWord = longestWord(str);
		System.out.println("Longest word is: " + longestWord);
		lettersCount(longestWord);
		
		StringBuilder sb = new StringBuilder(longestWord);		
		sb.reverse();
		System.out.println("\nReversed word: " + sb + "\n");
		
///////////////////////Task2
		System.out.println("Enter sentence: ");
		String sentence = br.readLine();
				
		String pattern = "[a-zA-Z0-9]+";
	    Pattern p = Pattern.compile(pattern);
	    Matcher m = p.matcher(sentence);
	    System.out.println("...Deleting spaces...");
	    while (m.find()) {
	        System.out.print(sentence.substring(m.start(), m.end()) + " ");
	    }
///////////////////////Task3
	    String patternDollar = "\\$(\\d)+((\\.)\\d{1,2})?";
	    System.out.println("\nEnter sentence:");
	    String sentenceD = br.readLine();
		
	    Pattern pD = Pattern.compile(patternDollar);
	    Matcher mD = pD.matcher(sentenceD);
	    System.out.println("\n...Searching price...");
	    while (mD.find()) {
	        System.out.print(sentenceD.substring(mD.start(), mD.end()) + "\n");
	    }
	    
	}
	
	public static String longestWord(String str) {
		
		String[] wrd = str.split(" ");
		String maxL = wrd[0];
		
		for (int i = 0; i < wrd.length; i++) {
			if(wrd[i].length() > maxL.length())
				maxL = wrd[i];
		}
		return maxL;
	}
	
	public static List<Character> parseWordToDifLetters (String wrd) {

		List<Character> difLet = new ArrayList<Character>();
		char[] c = wrd.toCharArray();
		difLet.add(c[0]);
		int flag = 0;
		
		for (int i = 1; i < c.length; i++) {
			flag = 0;
			for (int j = 0; j < i; j++) {
				if(c[i] == c[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				difLet.add(c[i]);
		}
				
		return difLet;
		
	}
	
	public static void lettersCount (String wrd) {
		
		List<Character>  parseWrd = parseWordToDifLetters(wrd);
		char[] c = wrd.toCharArray();
		int num = 0;
		
		for (int i = 0; i < parseWrd.size(); i++) {
			for (int j = 0; j < c.length; j++) {
				if(parseWrd.get(i) == c[j])
					num++;
			}
			System.out.println("Letter " + parseWrd.get(i)  + " is repeated " + num + " times");
			num = 0;
		}
	}

	
	
}

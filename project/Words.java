import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Words implements IWords {
	
	private Set<String> listOfAllWords;
//	private Set<String> currentList = new TreeSet<String>();
	
	public Words() {
		
		listOfAllWords = new TreeSet<>();
		
		FileReader fr;
		try {
			fr = new FileReader("words.txt");
			final BufferedReader br = new BufferedReader(fr);
			String word;
			while((word = br.readLine()) != null) {
				listOfAllWords.add(word);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file with words");
		} catch (IOException e) {
			System.out.println("Problem with working of words file");
		}
		
	}

	@Override
	public void showByMask(String maskWord) {

		maskWord = maskWord.toLowerCase();
		
		for(String word: listOfAllWords) {
			if(compareByMask(maskWord, word.toLowerCase())) {
				System.out.println(word.toLowerCase());
			}
			
		}
		
	}
	
	private boolean compareByMask(String w1, String w2) {
		w1 = w1.toLowerCase();
		w2 = w2.toLowerCase();
		
		if (w1.length() != w2.length()) {
			return false;
		}
		
		for (int i = 0; i < w1.length(); i++) {
			if (!((w1.charAt(i) == w2.charAt(i)) || (w1.charAt(i) == '*'))) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
	

















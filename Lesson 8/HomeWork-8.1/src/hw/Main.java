/*
 *Enter in the console sentence of five words. 
 *display the longest word in the sentence
 *determine the number of its letters
 *bring the second word in reverse order
 */

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input your text:");
		String[] strings = br.readLine().split(" ");

		List<String> list = new ArrayList<String>();

		for (String string : strings) {
			list.add(string);
		}

	//	sortByLength(list);
		System.out.println();

		printLongestWords(list);
		System.out.println();

		System.out.println("Second word reversed - " + reverse(2, strings));
	}

	// check if we have more than 1 word with max length
	public static void printLongestWords(List<String> list) {
		int maxsize = findLongestWord(list).length();
		System.out.println("Longest words (" + maxsize + " symbols):");
		for (String string : list) {
			if (string.length() == maxsize) {
				System.out.println(string);
			}
		}
	}

	public static String findLongestWord(List<String> list) {
		Iterator<String> i = list.iterator();
		String longestWord = list.get(0);
		while (i.hasNext()) {
			String currentWord = i.next();
			if (currentWord.length() > longestWord.length()) {
				longestWord = currentWord;
			}
		}
		return longestWord;
	}

	// the best solution to reverse String is by using StringBuilder.reverse()?

	// public static String reverse(int index, String[] strings) {
	// if (index <= strings.length) {
	// sb = new StringBuilder(strings[index - 1]);
	// return sb.reverse().toString();
	// } else {
	// return "impossible, we have only 1 word";
	// }
	// }

	public static String reverse(int index, String[] strings) {
		if (index <= strings.length) {

			char[] stringAarray = strings[index - 1].toCharArray();
			char[] reversedArray = new char[strings[index - 1].length()];

			for (int i = 0; i < reversedArray.length; i++) {
				reversedArray[i] = stringAarray[reversedArray.length - i - 1];
			}
			return new String(reversedArray);
		} else {
			return "impossible, we have only 1 word";
		}
	}

	public static List<String> sortByLength(List<String> list) {
		list.sort(new CompareByLength());
		return list;
	}

	private static class CompareByLength implements Comparator<String> {

		@Override
		public int compare(String arg0, String arg1) {
			return arg1.length() - arg0.length();
		}
	}

}

/* Create file1.txt file with a text about your career.
 * Read context from file into array of strings. 
 * Each array item contains one line from file.
 * Write in to the file2.txt
 *    1) number of lines in file1.txt.
 *    2) the longest line in file1.txt.
 *    3) your name and birthday date. 
 */

package hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String fileName = "file1.txt";
		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;

		List<String> list = new ArrayList<String>();

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String text = null;
			int count = 1;

			try {
				while ((text = br.readLine()) != null) {
					System.out.println("We have " + text.length() + " symbols in line " + count);
					list.add(text);
					count++;
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			fw = new FileWriter("file2.txt");
			// fw = new FileWriter("file2.txt", true); - if we will add "true" as parameter,
			// we will be able to add information to our file 
			// without removing old information
			bw = new BufferedWriter(fw);

			String linesNumber = lineNumber(list);
			bw.write(linesNumber);
			bw.newLine();
			bw.write(findLongestLine(list));
			bw.newLine();
			bw.write("Vitaliy Rolskyi, 04.04.1990");
			bw.newLine();

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String lineNumber(List<String> list) {
		return "Number of lines in file1.txt - " + list.size();
	}

	public static String findLongestLine(List<String> list) {
		String longestLine = list.get(0);
		for (String string : list) {
			if (string.length() > longestLine.length()) {
				longestLine = string;
			}
		}
		return "The longest line: " + longestLine;
	}
}

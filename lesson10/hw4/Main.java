package lesson10.hw4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		List<String> listOfLine = new ArrayList<>(); 
		String line;
		int maxLine = 0;
		int currentLine = 0;
		int lineOfname = -1;
		int lineOfDate = -1;
		
		while((line = br.readLine()) != null) {
			listOfLine.add(line);
			if ( line.length() > listOfLine.get(maxLine).length() ) {
				maxLine = currentLine;
			}
			
			if (line.contains("Burychka")) {
				lineOfname = currentLine;
			}
			
			if (line.contains("14.05.1983")) {
				lineOfDate = currentLine;
			}
			
			currentLine++;
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"));
		bw.write("" + listOfLine.size());
		bw.newLine();
		bw.write(listOfLine.get(maxLine));
		bw.newLine();
		bw.write(listOfLine.get(lineOfname));
		bw.newLine();
		bw.write(listOfLine.get(lineOfDate));
		
		br.close();
		bw.close();
	}

}

//Create file1.txt file with a text about your career.
//Read context from file into array of strings. Each array item contains one line from file.
//Write in to the file2.txt
//   1) number of lines in file1.txt.
//   2) the longest line in file1.txt.
//   3) your name and birthday date. 

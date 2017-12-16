package hw_10_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("rez.txt",false));
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> lines = new ArrayList<String>();
		List<Integer> linesSize = new ArrayList<Integer>();
		
		String str = null;
		while ((str=br.readLine())!=null){	
			lines.add(str);					//adding one line to list
			linesSize.add(str.length());	//and its size
			}
		
		int max = lines.get(0).length();
		int[] pos = new int[2];				//pos[1] - position, pos[0] = 0,1,2,3...
		pos[0] = 0;
		for (String string : lines) {
			if(max < string.length()) {
				max = string.length();
				pos[1] = pos[0];
			}
			pos[0]++;
		}
				
		bw.write("The number of lines in the file: " + lines.size());
		bw.write("\r\nThe longest line: " + lines.get(pos[1]));
		
		System.out.println("Enter your name:");
		bw.write("\r\nName: " + buffer.readLine());
		System.out.println("Enter your age:");
		Integer dateOfBirth = Year.now().getValue() - Integer.parseInt(buffer.readLine());
		bw.write("\r\nYear of birth: " + dateOfBirth.toString());
		
		br.close();
		bw.close();
		
	}

}

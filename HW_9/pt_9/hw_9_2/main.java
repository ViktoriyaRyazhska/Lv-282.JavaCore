package hw_9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arr = new ArrayList();
		
		System.out.println("Input start of the range:");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Input end of the range:");
		int end = Integer.parseInt(br.readLine());
		
		while(true) {
			System.out.println("Enter numbers from the range" + "(" + start + " - " + end + ") (any character to finish):");
			try {
				start = readNumberFromRange(start, end, br);
				arr.add(start);
			} catch (OutOfRangeExeption e) {
				System.err.println(e.getMessage());
			}catch (NumberFormatException e) {
				break;
			}finally {
				System.out.println("List contains: " + arr.toString() + "\n");
			}
		}
	}
	
	public static int readNumberFromRange (int start, int end, BufferedReader br) throws NumberFormatException, IOException, OutOfRangeExeption {
		
		int number = Integer.parseInt(br.readLine());
		
		if(!(number > start && number < end))
			throw new OutOfRangeExeption("Out of range!");
		return number;
	}

}

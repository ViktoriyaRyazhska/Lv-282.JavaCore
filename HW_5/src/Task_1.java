import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		byte[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		
		System.out.println("Enter number of month:");
		int num = Integer.parseInt(br.readLine());
		
		System.out.println("This month has " + months[num - 1] + " days");
		
	}

}

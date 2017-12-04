import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] intArr = new int[10];
		
		System.out.println("Enter 10 integer numbers:");
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
		}
		
		if(isPositiveAmount(intArr, 5))
			System.out.println(sumFirstNumbers(intArr, 5));
		else
			System.out.println(productLastNumbers(intArr, 5));

	}
	
	public static int sumFirstNumbers (int[] num, int amount) {
		
		int sum = 0;
		
		for (int i = 0; i < amount; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	
	public static int productLastNumbers (int[] num, int amount) {
		
		int dob = 1;
		
		for (int i = num.length-1; i >= amount; i--) {
			dob *= num[i];
		}
		
		return dob;
	}
	
	public static boolean isPositiveAmount (int[] num, int amount) {
		
		for (int i = 0; i < amount; i++) {
			if(num[i] < 0) 
				return false;
		}
		return true;
	}

}

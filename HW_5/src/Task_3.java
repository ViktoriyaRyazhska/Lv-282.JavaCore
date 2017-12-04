import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] array;
		array = new int[getNumberOfElements()];
		
		System.out.println("Enter elements:");
		initArray(array);
				
		System.out.println("Position of second positive number is " + getPositivePosition(array, 2));
		System.out.println("Position of minimum number is " + getMinPosition(array));
	}

	public static void initArray(int[] arr) throws NumberFormatException, IOException {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
	}
	
	public static int getNumberOfElements() throws NumberFormatException, IOException {
		System.out.println("Enter number of elements");
		int num = Integer.parseInt(br.readLine());
		return num;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("   " + arr[i]);
		}
		System.out.println();
	}
	
	public static int getPositivePosition(int[] arr,int positiveNumber) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				if(positiveNumber == 1)
					return i+1;
				positiveNumber--;
		}
	}
		return 0;
	}
	
	public static int getMinPosition (int[] arr) {
		int min = arr[0];
		int pos = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				pos = i;
			}
		}
		
		return pos+1;
	}
}

package hw9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args){
		int start=1;
        int end=100;
        for (int i = 0; i < 9; i++) {
        	try {
        		 readNumber(start,end);
        	}catch (NumberFormatException  e){
			System.out.println("wrong namber");	
			}catch (OutOfreadNumberExeption e) {
				System.out.println(e.toString());
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
        
        
}
	private static int readNumber(int start, int end) throws NumberFormatException, IOException, OutOfreadNumberExeption {
		int number=Integer.parseInt(br.readLine());
		System.out.println("Input number: "+number+", start =" + start + ", and " + end);
		if(number>end||number<start) {
			throw new OutOfreadNumberExeption();
			
		}		
		return number;
	}
}
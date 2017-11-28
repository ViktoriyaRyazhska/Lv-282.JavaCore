package Numbers;

public class main {

	public static void main(String[] args) {
		
		int []mas= {4,8,9,-4,77,88,-54,-9,55,1};
		int max = 0;
		int sum=0;
		int comm=0;
		int woor=0;
		
		for (int i = 0; i < mas.length; i++) {
			//input max numbers
			if (max < mas[i]) {
				max = mas[i];}
			
			//sum of positive numbers
			if(mas[i]>0) {
				 sum += mas[i];
				 comm++;}
			
			//the amountbers of negative num
			if(mas[i]<0) {
				woor++;}			
					
		}
		      System.out.println("max number ="+max);
		      System.out.println("sum of positive numbers = "+sum);
		      System.out.println("the amountbers of negative num = "+woor);
		    //the amountbers of negative num
		      if(comm>woor) {
					System.out.println(" values there is more positive,"+" positive is "+comm+" negative is "+woor);}
				if(comm<woor){
					System.out.println(" values there is more negative, "+" positive is "+comm+" negative is "+woor);
		      
		}
	
	}
}


package lesson10.hw3;

public class Main {

	public static void main(String[] args) {
		
		Thread t = new MyThreadOne();
		t.start();

	}

}





//Create a thread «one», 
//which would start the thread «two», 
//which has to output its number («Thread number two») 3 times and create thread «three»,
//which would to output message «Thread number three» 5 times.

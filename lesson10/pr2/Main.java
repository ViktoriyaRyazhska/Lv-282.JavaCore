package lesson10.pr2;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new HelloWorld("Hello, world", 5, 1000);
		
		Runnable r2 = new Peace("Peace in the peace", 3, 3000);
		Thread t2 = new Thread(r2);
		
		Thread t3 = new Thread(new MyName("Ivan"));
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
		
	}

	
	
}

//Output two messages «Hello, world» and
//«Peace in the peace» 5 times each with the intervals of 2 seconds,
//and the second - 3 seconds.
//After printing messages, print the text «My name is …»


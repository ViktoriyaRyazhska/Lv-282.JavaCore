package lesson10.hw1;

public class Main {

	

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Message("Message - 1", 5);
		Thread t2 = new Message("Message -  2", 5);
		Thread t3 = new Message("Message -  3", 5);
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
        
		t3.start();
     
	}
		
		
		

	

}


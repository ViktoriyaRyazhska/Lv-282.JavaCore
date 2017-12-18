package lesson10.pr1;

public class Main implements Runnable{

	public static void main(String[] args) {
		
		Thread t = new Thread(new Main()); 
		
		t.start();

	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) { 
			System.out.println("I study Java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


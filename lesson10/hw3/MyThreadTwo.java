package lesson10.hw3;

final public class MyThreadTwo extends Thread {
	
	Thread t = new MyThreadThree();
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		t.start();
	}
	
}

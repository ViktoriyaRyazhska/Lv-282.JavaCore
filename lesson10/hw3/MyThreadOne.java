package lesson10.hw3;

public class MyThreadOne extends Thread {

	Thread t1 = new MyThreadTwo();

	@Override
	public void run() {
		t1.start();
	}
}

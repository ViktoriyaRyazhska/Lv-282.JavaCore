package hw;

public class MyThread extends Thread {

	private String string;
	private int time;

	public MyThread(String string, int time) {
		this.string = string;
		this.time = time;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(string);
			try {
				sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

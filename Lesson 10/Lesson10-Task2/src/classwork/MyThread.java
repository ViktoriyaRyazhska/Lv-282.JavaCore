package classwork;

public class MyThread extends Thread {

	private String text;
	private int time;

	public MyThread(String text, int time) {
		this.text = text;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(text);
			try {
				sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

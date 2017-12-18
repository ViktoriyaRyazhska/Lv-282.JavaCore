package lesson10.pr2;

public class HelloWorld extends Thread {

	private String text;
	private int number; 
	private int pause;
	
	public HelloWorld(String text, int number, int pause) {
		this.text = text;
		this.number = number;
		this.pause = pause;
	}

	@Override
	public void run() {
		for (int i = 0; i < number; i++) {
			System.out.println(text);
			try {
				sleep(pause);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

package lesson10.pr2;

public class Peace implements Runnable {

	private String text;
	private int number; 
	private int pause;
	
	public Peace(String text, int number, int pause) {
		this.text = text;
		this.number = number;
		this.pause = pause;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < number; i++) {
			System.out.println(text);
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
		
}


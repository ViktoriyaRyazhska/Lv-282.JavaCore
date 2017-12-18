package lesson10.hw1;

public class Message extends Thread{

	private String message;
	private int times;
	
	public Message(String message, int times) {
		this.message = message;
		this.times = times;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.println(message);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
		

}

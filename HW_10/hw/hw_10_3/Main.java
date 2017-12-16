package hw_10_3;

public class Main {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Thread t2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread ¹:2");
						}
					}
				});
				
				Thread t3 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						for (int i = 0; i < 5; i++) {
							System.out.println("Thread ¹:3");
						}
					}
				});
				
				t2.start();
				t3.start();
			}
		});
		
		t1.start();

	}

}

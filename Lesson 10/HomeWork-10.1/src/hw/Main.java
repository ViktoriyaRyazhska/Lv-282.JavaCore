/* Run three threads and output there different messages for 5 times. 
 * The third thread supposed to start after finishing working 
 * of the two previous threads.
 */

package hw;

public class Main {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("Message 1 - 2sec", 2000);
		MyThread t2 = new MyThread("Message 2 - 3,5sec", 3500);
		MyThread t3 = new MyThread("Message 3 - 1,2sec", 1200);

		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
	}

}

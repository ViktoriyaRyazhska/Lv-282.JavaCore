/*Output text «I study Java» 10 times with the intervals of one second 
 * (Thread.sleep(1000);).
 */

package classwork;

public class Main extends Thread {

	public static void main(String[] args) {

		Thread t = new Thread();

		for (int i = 0; i < 10; i++) {
			System.out.println("I study Java");
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/* Cause a deadlock. 
 * Organize the expectations of ending a thread in main(),
 * and make the end of the method main() in this thread.
 */

package hw;

public class Main {

	public static Main m1 = new Main();
	public static Main m2 = new Main();
	public static int a = 0;

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				synchronized (m1) {
					Thread.yield();
					Main.a++;
					System.out.println("a++" + a);
					synchronized (m2) {
						MyClass.b++;
						System.out.println("b++" + MyClass.b);
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (m2) {
					Thread.yield();
					MyClass.b++;
					System.out.println("b++" + MyClass.b);
					synchronized (m1) {
						Main.a++;
						System.out.println("a++" + a);
					}
				}
			}
		};

		t1.start();
		t2.start();

	}

	private static class MyClass {
		public static int b = 0;
	}
}

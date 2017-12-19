/* Output two messages «Hello, world» and «Peace in the peace» 5 times each 
 * with the intervals of 2 seconds, 
 * and the second - 3 seconds. 
 * After printing messages, 
 * print the text «My name is …»
 */

package classwork;

public class Main extends Thread {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Hello, world", 2000);
		MyThread t2 = new MyThread("Peace in the peace", 3000);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("My name is Vitaliy");
	}
}

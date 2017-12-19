/* Create a thread «one», which would start the thread «two», 
 * which has to output its number («Thread number two») 3 times 
 * and create thread «three», which would to output message 
 * «Thread number three» 5 times.
 */

package hw;

public class Main {

	public static void main(String[] args) {

		Thread one = new Thread() {

			Thread two = new Thread() {

				Thread three = new Thread() {

					@Override
					public void run() {
						int count = 1;
						for (int i = 0; i < 5; i++) {
							System.out.println("Thread number three - " + count);
							count++;
						}
					}
				};

				@Override
				public void run() {
					int count = 1;
					for (int i = 0; i < 3; i++) {
						System.out.println("Thread number two - " + count);
						count++;
					}
					three.start();
				}
			};

			@Override
			public void run() {
				System.out.println("Thread number one");
				two.start();
			}
		};

		one.start();
	}
}

/* 
 * Enter the two variables of type String. 
 * Determine whether the first variable substring second. 
 * For example, if you typed «IT» and «IT Academy» you must receive true.
 */

package classwork;

public class Main {

	public static void main(String[] args) {

		String str1 = "IT";
		String str2 = "IT Academy";

		if (str2.contains(str1)) {
			System.out.println(true);
		}
	}

}

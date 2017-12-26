package Ñalculation;

/*
 * This class calculates the power of the batteries
 */

import BufferedReaderr.BufferedRead;

public class Ñalculation {

	static int constan = 41;
	static int constan2 = 600;
	static int square;
	static String t1;

	public Ñalculation() {

	}

	public Ñalculation(int square, String t1) {
		this.square = square;
		this.t1 = t1;

	}

	// calculates power by constant, constant for Ukrine
	public static int puwer() throws NullPointerException {
		int puwer = square * constan;
		System.out.println("battery power "+puwer);
		return puwer;
	}

	// calculates whether there is a corner or not
	public static int add_puver1(int puwer) throws NullPointerException {
		//System.out.println(puwer + t1);

		while (true) {

			if (t1.equals("yes")) {
				int puwer2 = puwer + constan2;
				System.out.println("battery power when corner room "+puwer2);
				return puwer2;
			}
			if (t1.equals("no")) {
				int puwer3 = puwer;
				System.out.println("battery power when not corner room "+puwer3);
				return puwer3;
			}
		}

	}

	@Override
	public String toString() {
		return "Ñalculation [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}

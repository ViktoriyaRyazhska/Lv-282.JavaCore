package lesson4;

public class numberOdd {

	public static void main(String[] args) {
		int[] a = { 2, 3, 6 };
		int x;
		int y = 0;
		for (int i : a) {
			x = i % 2;
			if (x != 1) {
				y++;
			}
		}
		System.out.println("Кількість парних чисел: " + y);

	}

}

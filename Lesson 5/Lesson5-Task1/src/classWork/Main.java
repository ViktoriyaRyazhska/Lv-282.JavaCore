package classWork;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 5, -7, 0, 0, 11, 3, -20, 2, -20, 5 };

		System.out.println(maxValue(arr));
		System.out.println(sumPositive(arr));
		amountPositive(arr);
	}

	private static int maxValue(int array[]) {
		int max = 0;

		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}

		return max;
	}

	private static int sumPositive(int array[]) {
		int sumPos = 0;

		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				sumPos += i;
			}
		}

		return sumPos;
	}

	private static void amountPositive(int arr[]) {
		int i = 0;

		int positive = 0;
		int negative = 0;

		while (i < arr.length) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			}
			i++;
		}

		System.out.println("We have " + positive + " positive elements");
		System.out.println("We have " + negative + " negative elements");
	}

}

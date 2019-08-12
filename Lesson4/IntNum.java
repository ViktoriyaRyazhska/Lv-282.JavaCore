package lesson4;

public class IntNum {

	private static int max = Integer.MIN_VALUE;
	private static int min = Integer.MAX_VALUE;
	private int iNum = 0;
	protected static int i = 0;

	public int getiNum() {
		return iNum;
	}

	public void setiNum(int iNum) {
		this.iNum = iNum;
	}

	public IntNum() {
	}

	public IntNum(int iNum) {
		this.iNum = iNum;
		if (iNum > max) {
			max = iNum;
		}
		if (iNum < min) {
			min = iNum;
		}
	}

	public static void MinMax() {
		System.out.println("Min: " + IntNum.min);
		System.out.println("Max: " + IntNum.max);
	}

}

package java_4;

public class AT6 {

	public static void main(String[] args) {
		
		int same;
		int indexDif = -1;
		
		int[] a = {2, 3, 2, 2};
		
		if (a[0] == a[1]) {
			same = a[0];
		} else if (a[0] == a[2]) {
			same = a[0];
		} else {
			same = a[1];
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != same) {
				indexDif = i;
				break;
			}
		}
		
		System.out.println("Index of other number is: " + indexDif);
	}

}

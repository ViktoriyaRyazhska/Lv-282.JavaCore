package java_4;

public class AT2 {

	public static void main(String[] args) {
		
		double[] x = new double[20];
		x[0] = 0;
		x[1] = 5d/8d;		
		
		for (int i = 2; i < x.length; i++){
			x[i] = (x[i-1]/2) + 0.75*x[i-2];
		}
		
		for (double value: x) {
			System.out.println(value);
		}
		
	}
	
}

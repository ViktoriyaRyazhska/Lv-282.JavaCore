


public class zavdanja_1 {
	int r;	 

	
	public zavdanja_1(int r) {
		this.r = r;
		
	}

	public  void perimeter() {
		int  perimeter=(int) (2*(Math.PI)*r);
		System.out.println("Perumeter"+perimeter);
	}
	
	public  void area_by() {
		int area_by=(int) (Math.PI*Math.pow(r, 2));
		System.out.println("area by"+area_by);
	}

}

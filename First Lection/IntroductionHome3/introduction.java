
public class IntroductionHHome3 {

	public static void main(String[] args) {
		String c1 = "Ukraine";
		String c2 = "Chaina";
		String c3 = "Italia";
	System.out.println("Вартість розмови за 1хв:"
			+ ", "+ c1 + "= 8.50"
			+ ", " +c2 + "= 3.00"
			+ ", " + c3 + "= 1.50"
			);
	double t1 = 23;
	double t2 = 6;
	double t3 = 8;
	System.out.println("Час розмови з країнами:"
			+ " " + c1 + " рівний= " + t1 + 
			" " + c2 + " рівний= " + t2 +
			" " + c3 + " рівний= " + t3 
			);
	double z1 = 8.50*t1;
	double z2 = 3.00*t2;
	double z3 = 1.50*t3;
	
	System.out.println("Вартість розмов:" +
			c1 +"=" +z1 +" "+
			c2 +"=" +z2 +" " +
			c3 +"=" +z3 
			);
	System.out.println("Загальна вартість розмов:" +
			(z1+z2+z3));
			
	}

}

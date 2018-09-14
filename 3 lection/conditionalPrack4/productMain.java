
public class ConditionalPrack4 {

	public static void main(String[] args) {
		
		Pruduct [] pruduct = new Pruduct[4];
		
		pruduct [0] = new Pruduct("milk", 43.99, 2);
		pruduct [1] = new Pruduct("oil", 25.99, 12);
		pruduct [2] = new Pruduct("ananas", 69.99, 26);
		pruduct [3] = new Pruduct("kavun", 12.00, 59);
		
		Pruduct.MostCoints(pruduct);
		Pruduct.MostKilkist(pruduct);
	}

}

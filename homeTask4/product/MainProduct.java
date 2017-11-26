package product;

public class MainProduct {

	public static void main(String[] args) {
		
		Product[] product = new Product[4];
		
		product[0] = new Product("Bread", 9.85, 47);
		product[1] = new Product("Chees", 137.17, 14);
		product[2] = new Product("Apple", 15.10, 20);
		product[3] = new Product("Milk", 21.15, 31);
	
		Product.mostExpensive(product);
	
		Product.bigestQuantity(product);
	}

}

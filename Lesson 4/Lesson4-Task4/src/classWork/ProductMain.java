package classWork;

public class ProductMain {

	public static void main(String[] args) {

		
		Product p1 = new Product("Book", 50, 2);
		Product p2 = new Product("Pen", 10, 10);
		Product p3 = new Product("Pencil", 5, 10);
		Product p4 = new Product("Penal", 50, 2);
		
		Product prod[] = {p1, p2, p3, p4};  
		
		double maxPrice = 0;
		int maxQty = 0;
		
		for (Product product : prod) {
			if (maxPrice < product.getPrice()) {
				maxPrice = product.getPrice();				
			}	
			
			if (maxQty < product.getQty()) {
				maxQty = product.getQty();
			}
		}
		
		for (Product product : prod) {
			if (maxPrice == product.getPrice()) {
				System.out.println("Most expensive product is " + product.getName() + ". Quantity = " + product.getQty());
			}
		}
		
		for (Product product : prod) {
			if(maxQty == product.getQty()) {
				System.out.println("There are " + maxQty + "pcs of " + product.getName() + "s on our stock!");			
			}
		}
		
	}

}

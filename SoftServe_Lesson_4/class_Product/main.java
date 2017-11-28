package class_Product;



public class main {

	public static void main(String[] args) throws NullPointerException,ArrayIndexOutOfBoundsException{
		Product pro_1= new Product("tomato",44,5);
		Product pro_2= new Product("pepper",100,4);
		Product pro_3= new Product("orange",66,8);
		
		
		Product produk[]=new Product[3];
		Object poduk_2[]= {pro_1.getPrice(), pro_2.getPrice(), pro_3.getPrice()};
		Object poduk_3[]= {pro_1.getQuantity(),pro_2.getQuantity(),pro_3.getQuantity()};
		
		Product.expensive(poduk_2);
		Product.Biggest_quantity(poduk_3);
		
	}
}

	

		

	



package class_Product;

import com.sun.media.sound.SimpleSoundbank;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product() {
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
	
	
//	 static  int name_and_quantity (Product produk[]) {
//		int max = 0;
//		
//		for (int i = 0; i < produk.length; i++) {
//			if (produk[max].getPrice()<produk[i].getPrice()){
//				max=i;
//				
//			}
//		}
//		System.out.println("Most expensive " + produk[max]);
//		return max;
//		
//	}
	
	
	static int expensive(Object produk[]) {
		int max=0;
		for (int i = 0; i < produk.length; i++) {
			if (max < (int)produk[i]) {
				max = (int)produk[i];
			}
	
		
	}
	System.out.println("expensive "+max);
	return max;
	
	
	}
	static int Biggest_quantity(Object produk[]) {
		int max=0;
		for (int i = 0; i < produk.length; i++) {
			if (max < (int)produk[i]) {
				max = (int)produk[i];
			}
	
		
	}
	System.out.println("Biggest quantity "+max);
	return max;
	
	}
}

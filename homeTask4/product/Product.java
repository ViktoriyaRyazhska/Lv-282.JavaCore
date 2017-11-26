package product;

public class Product {
	
	private String name;
	private double prise;
	private int quantity;
	
	public Product(String name, double prise, int quantity) {
		this.name = name;
		this.prise = prise;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	static int mostExpensive(Product[] product) {
		
		int index = 0;
		for (int i = 1; i < product.length; i++) {
			if (product[index].getPrise() < product[i].getPrise()) {
				index = i; 
			}
		}
		
		System.out.println("Most expensive " + product[index]);
		return index;
	}

	static int bigestQuantity(Product[] product) {
			
			int index = 0;
			
			for (int i = 1; i < product.length; i++) {
				if (product[index].getQuantity() < product[i].getQuantity()) {
					index = i; 
				}
			}
			System.out.println("Biggest quantity " + product[index]);
			return index;
		}	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", prise=" + prise + ", quantity=" + quantity + "]";
	}
	
	
}

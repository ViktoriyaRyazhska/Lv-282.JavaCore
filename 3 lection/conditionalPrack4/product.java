
public class Pruduct {
	private String name;
	private double tsina;
	private int kilkist;
	
	@Override
	public String toString() {
		return "pruduct [name=" + name + ", tsina=" + tsina + ", kilkist=" + kilkist + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTsina() {
		return tsina;
	}

	public void setTsina(double tsina) {
		this.tsina = tsina;
	}

	public int getKilkist() {
		return kilkist;
	}

	public void setKilkist(int kilkist) {
		this.kilkist = kilkist;
	}

	public Pruduct(String name, double tsina, int kilkist) {
		this.name = name;
		this.tsina = tsina;
		this.kilkist = kilkist;
	}

	static int MostCoints (Pruduct [] pruduct){
		int index = 0;
		for (int i =1; i  < pruduct.length; i ++) {
			if (pruduct[index].getTsina() < pruduct[i].getTsina());
			index = i;
		}
		System.out.println("Найдорожчий продукт є: " + pruduct[index]);
		return index;
		
	}
	static int MostKilkist (Pruduct [] pruduct){
		int index = 0;
		for (int i =1; i  < pruduct.length; i ++) {
			if (pruduct[index].getKilkist() < pruduct[i].getKilkist()){
			index = i;
			}
		}
		System.out.println("Найбільше продукту є: " + pruduct[index]);
		return index;
	}

}

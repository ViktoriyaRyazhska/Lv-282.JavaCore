
public class Cars {

	private String type;
	private int year_of_production;
	private double engine_capacity;
	
	public Cars() {
	}
	public Cars(String type, int year_of_production, double engine_capacity) {
		this.type = type;
		this.year_of_production = year_of_production;
		this.engine_capacity = engine_capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear_of_production() {
		return year_of_production;
	}
	public void setYear_of_production(int year_of_production) {
		this.year_of_production = year_of_production;
	}
	public double getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(double engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	
	public static void displayCarsByYear(Cars[] car, int year){
		
		for (int i = 0; i < car.length; i++) {
			if(car[i].getYear_of_production() == year)
				System.out.println(car[i].toString());		
		}
		
	}
	
	public static void orderByYear(Cars[] car) {
		Cars tmp;
		
		for (int i = 0; i < car.length-1; i++) {
			for (int j = i+1; j < car.length; j++) {
				if(car[i].getYear_of_production() > car[j].getYear_of_production()) {
				tmp = car[i];
				car[i] = car[j];
				car[j] = tmp;
				}
			}
		}
		
	}
	
	@Override
	public String toString() {

		return "Car [type=" + type + ", yearOfProduction=" + year_of_production + ", engineCapacity="
		+ engine_capacity + "]";
	}
	
	public static void displayCars(Cars[] car){
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i].toString());	
		}
	}
	
}

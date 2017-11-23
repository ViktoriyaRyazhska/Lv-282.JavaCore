package example;

public class Student {

	private String name;
	private int rating;
	
	private static int count = 0;
	private static int sum = 0;
	
	
	public Student () {
		count++;
	}
	
	public Student (String name) {
		this.name = name;
		count++;
	}
	
	public Student (String name, int rating) {
		this.name = name;
		this.rating = rating;
		count++;
		sum += this.rating;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		sum -= this.rating;
		this.rating = rating;
		sum += rating;
	}
	
	public void changeRating(int rating) {
		setRating(rating);
	}
	
	
	public static double getAvgRating() {
		return sum/(double)count;
	}
		
	public static int getCount() {
		return count;
	}
	
	public static int getSum() {
		return sum;
	}

	public boolean betterStudent(Student st) {
		return this.getRating()>st.getRating();
	}
	

	@Override
	public String toString() {
		return "Student [name = " + name + ", rating = " + rating + "]";
	}

	
}

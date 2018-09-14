
public class Employee {
	private String name;
	private int course;
	private int hourse;
	
	public static int totalSum;

	public Employee(String name, int hourse) {
		super();
		this.name = name;
		this.hourse = hourse;
	}

	public Employee(String name, int course, int hourse) {
		this.name = name;
		this.course = course;
		this.hourse = hourse;
		totalSum += course*hourse;
	}

	public String get() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	public int getHourse() {
		return hourse;
	}
	
	public double sallery ()
	{
		return (course*hourse);
	}

	@Override
	public String toString() {
		
		return ("The Employee"+" " + this.name +" work "+ this.hourse + " and has sallery" + " "
				+ (this.course*this.hourse) + " $");
	}
    
	public void changeRate (int course)
	{
		System.out.println("The Employee" + " " + this.name + " " 
							+ "has sallery" + " " +" we change course" + this.course + course +  " and now his salary is "
							+ (course * this.course));
		totalSum += sallery();
		this.course = course;
	}
	
	public void bonus (){
		System.out.println(" If employee" + this.name + " work nise, he has a bonus:" + " "+
							(this.course*0.1* this.hourse));
		totalSum += this.course * this.course*0.1;
	}
	public static double showTotalSalary() {
		return totalSum;
	}	
}

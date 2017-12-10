package hw7_3;

import java.util.Comparator;



public class Student {
	private String name;
	private Integer course;
	static CourseComparable courseComparable= new CourseComparable();
	static  NameComparable  nameComparable=new  NameComparable();
	
	
	public Student() {
		
	}
	public Student(String name, Integer course) {
	
		this.name = name;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCourse() {
		return course;
	}
	public void setCourse(Integer course) {
		this.course = course;
		
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	
	
	
	
	
	

}

package hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
	
	private String name;
	private Date bY = null;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
	public Person() {}
	
	public Person(String name, int year) throws ParseException {
		this.name = name;
		try {
		this.bY = sdf.parse(Integer.toString(year));
		this.age();
		} catch (ParseException e){
			System.out.println("Wrong birthYear format");
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void changeName() throws IOException {
		System.out.println("Input new name for "+ this.name);
		String name = br.readLine();
		this.name = name;
	}

	public Date getBY() {
		return this.bY;
	}
	

	public void setBY(int year) {
		this.bY = new Date(year);
		this.age();
	}
	
	
	public int age() {
		int age = Integer.valueOf(sdf.format(Calendar.getInstance().getTime())) - Integer.valueOf(sdf.format(bY));
		return age;
	}
	

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void input() throws IOException, ParseException {
		System.out.println("Input name");
		String name = br.readLine();
		this.setName(name);
		System.out.println("Input birthYear, like 1999");
		int year = Integer.parseInt(br.readLine());
		this.bY = sdf.parse(Integer.toString(year));
		
		this.age();
	}
	
	public void output() {
		System.out.println(this.toString());
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", bY=" + sdf.format(bY) + ", age = " +this.age() + "]";
	}
	
}

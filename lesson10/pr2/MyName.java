package lesson10.pr2;

public class MyName implements Runnable {
	
	private String name;

	public MyName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("My name is " + name);
	}
	
	
	
}

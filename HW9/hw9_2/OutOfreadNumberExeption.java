package hw9_2;

import java.util.Arrays;

public class OutOfreadNumberExeption extends Exception {
	
	private static final long serialVersionUID = 1985L;
	
	

	public OutOfreadNumberExeption() {
		super();
		
	}

	public OutOfreadNumberExeption(String arg0) {
		super(arg0);
	}

	@Override
	public String toString() {
		return "You have limit number!";
	}
	
	
}
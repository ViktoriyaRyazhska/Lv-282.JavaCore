package lesson9.pr2;

public class ColorException extends Exception{

	
	private static final long serialVersionUID = -7724426007532493066L;

	public ColorException(String message) {
		super(message);
	}

	public ColorException() {
		
	}

	@Override
	public String toString() {
		return "ColorException []";
	}
	
	
}

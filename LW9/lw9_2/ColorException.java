package lw9_2;

public class ColorException extends Exception{
	   private  String Color;
	   private  Plants plants;

//	public ColorException(String color) {
//		super();
//		plants=new  Plants();
//		Color = color;		
//	}	


	


	public  Color ColorException(String color) throws ColorException   {
		Color= color;
		plants=new Plants();
		switch (color.toLowerCase()) {
		case "red":
			return  plants.getColor().Red;
		case "blue":
			return  plants.getColor().Blue;
		case "white":
			return plants.getColor().White;
		
		default:
			throw new ColorException();
}

	}

	@Override
	public String toString() {
		return "ColorException [Color=" + Color + "]";
	}

	
	
	

}

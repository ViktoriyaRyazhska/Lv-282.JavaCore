package pt_9_2;

public class Plant {
	
	private TYPE type;
	private COLOR color;
	private int height;
	
	public Plant( String type,String color,int height) throws TypeExeption, ColorExeption {
		TYPE t = toTypeEnum(type);
		COLOR c = toColorEnum(color);
		this.type = t;
		this.color = c;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public COLOR getColor() {
		return color;
	}
	public void setColor(COLOR color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Plant [Type: " +this.type+ ". Color: " +this.color+ ". Height: " +this.height+ "]";
	}

	private COLOR toColorEnum(String color) throws ColorExeption {
		switch(color.toLowerCase()){
			case "blue" : return COLOR.Blue;
			case "red" : return COLOR.Red;
			case "yellow" : return COLOR.Yellow;
        	case "black" : return COLOR.Black; 
        	case "green" : return COLOR.Green; 
        	case "white" : return COLOR.White; 
        	default : throw new ColorExeption("Input only base color (blue,red,yellow,black,green,white)");
		}

	}
	
	private TYPE toTypeEnum(String type) throws TypeExeption {
		switch(type.toLowerCase()){
			case "rose" : return TYPE.Rose;
			case "iris" : return TYPE.Iris;
			case "sunflower" : return TYPE.Sunflower;
        	case "lily" : return TYPE.Lily; 
        	case "gladiolus" : return TYPE.Gladiolus; 
        	default : throw new TypeExeption("Input only the following flowers: rose,iris,sunflower,lily,gladiolus");
		}

	}
	
	
}

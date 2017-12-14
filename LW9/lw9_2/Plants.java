package lw9_2;

public class Plants {
	private Type type;
	private Color color ;	
	private int size;
	private  ColorException col;
	private TypeException typ;
	
	public Plants() {
		
	}

	

	public Plants(String type1, String color1, int size)  throws TypeException, ColorException{
	
		
		col=new  ColorException();
		typ=new TypeException();
		this.size = size;	
		this.type=(Type) typ.TypeException(type1);
		this.color=(Color) col.ColorException(color1);
	}






	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plants [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	


	
	
	
	
	
}

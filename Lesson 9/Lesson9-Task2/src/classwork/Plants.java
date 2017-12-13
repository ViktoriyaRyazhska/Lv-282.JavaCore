package classwork;

public class Plants {

	private int size;
	private Type type;
	private Color color;

	public Plants(int size, String type, String color) throws TypeException, ColorException {
		this.size = size;
		this.type = typeStrToEnum(type);
		this.color = colorStrToEnum(color);
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "red":
			return Color.red;
		case "blue":
			return Color.blue;
		case "white":
			return Color.white;
		case "yellow":
			return Color.yellow;
		default:
			throw new ColorException("Input only color blue, red, white or yellow");
		}
	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.Rose;
		case "tulip":
			return Type.Tulip;
		case "pion":
			return Type.Pion;
		case "orchid":
			return Type.Orchid;
		case "iris":
			return Type.Iris;
		case "lily":
			return Type.Lily;
		default:
			throw new TypeException("Tnput type of flower from next list: Rose, Tulip, Pion, Orchid, Iris, Lily");
		}
	}

	@Override
	public String toString() {
		return "Plants [size=" + size + ", type=" + type + ", color=" + color + "]";
	}

}

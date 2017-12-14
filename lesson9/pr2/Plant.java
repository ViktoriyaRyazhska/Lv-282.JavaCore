package lesson9.pr2;

public class Plant {
	private Type type;
	private Color color;
	private int size;

	public Plant(String type, String color, int size) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.size = size;
		this.type = t;
		this.color = c;
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("You choose color - " + color + ". You should take only color blue, red or white");
		}
	}

	private Type typeStrToEnum(String type) throws TypeException {
		
		switch (type.toLowerCase()) {
		
		case "tulip":
			return Type.Tulip;
		case "rose":
			return Type.Rose;
		case "camomile":
			return Type.Camomile;
		case "georgine":
			return Type.Georgine;
		default:
			throw new TypeException("") {
				private static final long serialVersionUID = 1L;

				@Override
				public String toString() {
					return "You choose " + type + " but we have only next type of flower: Tulip, Rose, Camomile, Georgine";
				}
					
			};
		}
	}

	@Override
	public String toString() {
		return "This Plant has type " + type + ", color " + color + " and size =" + size;
	}

}

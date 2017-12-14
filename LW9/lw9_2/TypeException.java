package lw9_2;

public class TypeException extends  Exception{
	
	private  String Type;
	 private  Plants plants;
	 

//	public TypeException(String type) {
//		super();
//		Type = type;
//		plants=new Plants();
//	}


	public  Type TypeException(String type) throws TypeException {
		Type = type;
		plants=new Plants();
		switch (type.toLowerCase()) {
		case "rose":
			return plants.getType().Rose;
		case "Camomile":
			return plants.getType().Camomile;
		case "Georgine":
			return plants.getType().Georgine;
		case "Tulip":
			return plants.getType().Tulip;
		
		default:
			throw new TypeException();
}}


	@Override
	public String toString() {
		return "TypeException [Type=" + Type + "]";
	}
	
	 


	
	

	
	

}

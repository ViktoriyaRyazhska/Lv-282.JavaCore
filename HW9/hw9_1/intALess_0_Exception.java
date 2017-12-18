package hw9_1;

public class intALess_0_Exception extends Exception{
	
	private static final long serialVersionUID = 1986L;
	
	public intALess_0_Exception(){
		super( );		
	}
	
	
	
	public intALess_0_Exception(String arg0){
		super( arg0);		
	}



	@Override
	public String toString() {
		return "int A=0";
	}
	
	

}

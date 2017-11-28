package the_country;

public class main {

	public static <ñountry> void main(String[] args) throws  NullPointerException{
		
		country count1=new country("brazil");
		country count2=new country("Russia");
		country count3=new country("Poland");
		country count4=new country("Egypt");
		country count5=new country("Canada");
		
		continents contin;
		
		Object count0[]= {count1.getName(),count2.getName(),count3.getName(),count4.getName(),count5.getName()};
		for (Object object : count0) {
			//System.out.println(object);
		
		 switch(object.toString()){
		 
	        case "brazil" :contin=continents.SOUTH_AMERICA;
	           System.out.println("brazil ="+ continents.SOUTH_AMERICA);
	           break; 
	        case "Russia" :contin=continents.ASIA;
	           System.out.println( "Russia ="+continents.ASIA);
	           break;
	        case "Poland" :contin=continents.EUROPA;
	            System.out.println("Poland ="+continents.EUROPA);
	            break; 
	        case "Egypt" :contin=continents.AFRICA;
	            System.out.println("Egypt ="+continents.AFRICA);
	            break; 
	        case "Canada" :contin=continents.NORTH_AMERICA;
	            System.out.println("Canada ="+continents.NORTH_AMERICA);
	            break;
	       
	        
	        default :
	                System.out.println("error enter country");
	    }
	}
}
}


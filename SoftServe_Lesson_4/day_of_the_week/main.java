package day_of_the_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		
		System.out.println("enter a number from 1 to 7");
        int Number_1=Integer.parseInt(br.readLine());
        
        switch(Number_1){
        case 1 :
           System.out.println(" Monday, der Montag, mandag");
           break; 
        case 2 :
           System.out.println("Tuesday, der Dienstag, tirsdag");
           break;
        case 3 :
            System.out.println("Wednesday, der Mittwoch, onsdag");
            break; 
        case 4 :
            System.out.println("Thursday, der Donnerstag, torsdag");
            break; 
        case 5 :
            System.out.println("Friday, der Freitag, fredag");
            break;
        case 6 :
            System.out.println("Saturday, der Samstag, lørdag");
            break; 
        case 7 :
            System.out.println("Sunday, der Sonntag, søndag");
            break; 
        
        default :
                System.out.println("error enter a number from 1 to 7");
    }
	

	}

}

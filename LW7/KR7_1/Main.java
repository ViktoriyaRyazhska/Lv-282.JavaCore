package KR7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import sun.awt.dnd.SunDragSourceContextPeer;

public class Main {

	public static void main(String[] args) {
	     
	      Random rand = new Random();
	      List myCollection = new ArrayList();
	      for (int i = 0; i < 10; i++) {        
	        
	    	  myCollection.add(rand.nextInt(50)); 
	      }

	      Collections.sort(myCollection);
	       System.out.println(myCollection);
	       System.out.println();
	     //newCollection all positions of element more than 5 in the collection
	     List<Integer> myCollection2 = new ArrayList(myCollection);	 
	     
	     for (Iterator<Integer> iterator1 = myCollection2.iterator(); iterator1.hasNext(); ) {
	    	 
	     
	    	    if (iterator1.next() < 6) {
	    	        iterator1.remove();
	    	    }
	     }
	     System.out.println(myCollection2);
	     System.out.println();
	     
	     //Remove from collection myCollection elements, which are greater then 20
	     List<Integer> myCollection3 = new ArrayList(myCollection);
	     
	     for (Iterator<Integer> iterator2 = myCollection3.iterator(); iterator2.hasNext(); ) {
	    	 
		     
	    	    if (iterator2.next() > 20) {
	    	        iterator2.remove();
	    	    }
	     }
	     System.out.println(myCollection3);
	     System.out.println();
	     
	     //Insert elements 1, -3, -4 in positions 2, 8, 5
	     List<Integer> myCollection4 = new LinkedList(myCollection);
	     myCollection4.add(1,1);
	     myCollection4.add(4,-4);
	     myCollection4.add(7,-3);
	     System.out.println( myCollection4);
	     System.out.println();
	     
	     //. Print result in the format: “position – xxx, value of element – xxx”
	     for (int i = 0; i < myCollection4.size(); i++) {
	    	 System.out.println("position – " + i + ", value of element – " +myCollection4.get(i));
			
		}
	    	 
	     }
	        }
	
	    
	

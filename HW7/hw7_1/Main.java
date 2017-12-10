package hw7_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Union;

public class Main {

	public static void main(String[] args) {
		
		 Random rand = new Random();
		 
		Set<Integer> set1 = new HashSet<Integer>();
		     for (int i = 0; i < 10; i++) {        
	    	  set1.add(rand.nextInt(50)); 
	      }
		     
		Set<Integer> set2 = new HashSet<Integer>();
		 for (int i = 0; i < 10; i++) {		        
	    	  set2.add(rand.nextInt(50)); 
	      }
		 
		 Set<Integer> set3 = new HashSet<Integer>();
		
		 
		 System.out.print(set1+" ");
		 System.out.println();
		 System.out.print(set2+" ");
		 System.out.println();
		  set3=union(set1, set2);
		 System.out.print(set3+" ");
		 System.out.println();
		 set3.clear();
		 intersect(set1, set2, set3);
		 System.out.print(set3+" ");
		 
	}
		 
		 
		 private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
				Set<Integer> set3 = new TreeSet<Integer>();
				Iterator<Integer> iterator = set1.iterator();
				
				   while(iterator.hasNext()) {
					set3.add(iterator.next());
				}
				
				                 iterator = set2.iterator();
				
				   while(iterator.hasNext()) {
					set3.add(iterator.next());
				}
				
		return set3;
	
	}
		 private static void intersect(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
				
				Integer tem;
				Iterator<Integer> iterator = set1.iterator();
				
				while (iterator.hasNext()) {
					tem = iterator.next();
					if (set2.contains(tem)) {
						set3.add(tem);
					}
		}
		

}}
	

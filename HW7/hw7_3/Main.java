package hw7_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
List<Student> list = new ArrayList<Student>();
		
		
		list.add(new Student("Vassja", 5));
		list.add(new Student("Anna", 1));
		list.add(new Student("Diana", 3));
		list.add(new Student("Car", 3));
		list.add(new Student("Andry", 5));
		list.add(new Student("Fedir", 1));
		list.add(new Student("Anna", 1));
		list.add(new Student("Oleh", 1));
		
         printAll(list);
         System.out.println();
         PrintStudents(list,1);
         System.out.println();
         
         System.out.println("Sorted by name by course: ");
         list.sort(Student.courseComparable);
         printAll(list);
         
         System.out.println();
         System.out.println("Sorted by name: ");
 		list.sort(Student.nameComparable);
         printAll(list);

	}
	
       private static <T> void printAll(List<T>list) {
    	   Iterator<T> iterator = list.iterator();   		
   		while(iterator.hasNext()) {
   			System.out.println(iterator.next());
   }		
   		
   			
   		}
       private static <T> void PrintStudents(List<T>list,Integer course){
    	   Iterator <T> iterator = list.iterator();
    	   Student temp;
    	   while(iterator.hasNext()) {
    		    temp= (Student) iterator.next();
    		   if(temp.getCourse().equals(course)) {
    			   System.out.println(temp.getName());
    		   }
    	   }
     }
}
		
	


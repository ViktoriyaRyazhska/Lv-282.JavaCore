package PW7;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends MyCollection {

       public static void main(String[] args) throws IOException {


           List<Integer> myCollection = new ArrayList<>();

           System.out.print("My Collection: \n" + addRandomInteger(myCollection, 10, -20, 30));
           System.out.println();
           System.out.print("New Collection with positions of values > 5: \n" + getPosition(myCollection, 5));
           System.out.println();
           System.out.print("My Collection without elements > 20: \n" + removeElement(myCollection, 20));
           System.out.println();

           insertElement(myCollection, 1, 2);
           insertElement(myCollection, -3, 8);
           insertElement(myCollection, -4, 5);
           System.out.println("Modifications collection: ");

           printColl(myCollection);
           System.out.println();
           System.out.println(sortedColl(myCollection));

       }
}
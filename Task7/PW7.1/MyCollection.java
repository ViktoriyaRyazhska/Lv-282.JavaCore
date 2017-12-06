package PW7;

import java.util.*;

public class MyCollection {

    private static Random random = new Random();


    public static List<Integer> addRandomInteger(List<Integer> coll, int size, int iMin, int iMax) {
        for (int i = 0; i < size; i++) {
            coll.add(random.nextInt(iMax - iMin));
        }
        return coll;
    }

    public static List<Integer> getPosition(List<Integer> coll, int value) {

        List<Integer> newColl = new ArrayList<>();

        for (Integer i : coll) {
            if (i > value) {
                newColl.add(coll.indexOf(i));

            }
        }

        return newColl;
    }


    public static List<Integer> removeElement (List<Integer> coll, int value) {

        List<Integer> newColl2 = new ArrayList<>();
        newColl2.addAll(coll);

        Iterator<Integer> iterator = newColl2.iterator();


        while (iterator.hasNext()){
            if (iterator.next() > value){
                iterator.remove();
            }
        }
        return newColl2;
    }


    public static List<Integer> insertElement(List<Integer> coll, int value, int index) {

        coll.add(index, value);
        return coll;
    }

    public static void printColl(List<Integer> coll) {

        for (Integer element : coll) {
            System.out.println("position - " + coll.indexOf(element) + ", value of element - " + element);
        }
    }

    public static List<Integer> sortedColl (List<Integer> coll) {
        coll.sort(intComparator);
        System.out.println("My sorted collection: ");
        return coll;
    }

    private static IntComparator intComparator = new IntComparator();

    private static class IntComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer a, Integer b) {
            return a - b;
        }
    }

}


package collections.deletetask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

public class DeleteExampleTwo {
    public static void main(String[] args) {
        int size = ThreadLocalRandom.current().nextInt(10, 15);
        Integer[] integers = generateArray(size);
        printer(integers);

        ArrayList<Integer> integerArrayList = integerArrayListCreate(integers);
        System.out.println(integerArrayList);

        numberRemover(integerArrayList);
        System.out.println(integerArrayList);

    }

    public static Integer[] generateArray(int size) {
        Integer[] integers = new Integer[size];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
        return integers;
    }

    public static void printer(Integer[] integers) {
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> integerArrayListCreate(Integer[] integers) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, integers);
        return integerArrayList;
    }

    public static void numberRemover(ArrayList<Integer> integerArrayList) {
        ListIterator<Integer> integerListIterator = integerArrayList.listIterator();
        while (integerListIterator.hasNext()) {
            Integer num = integerListIterator.next();
            if (num % 3 == 0) {
                integerListIterator.remove();
            }
        }
    }
}

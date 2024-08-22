package collections.deletetask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

public class DeleteExample {

    private final Integer[] integers = generateArray();
    private final ArrayList<Integer> integerArrayList = integerArrayListCreate(integers);

    public ArrayList<Integer> getIntegerArrayList() {
        return integerArrayList;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public Integer[] generateArray() {
        int size = ThreadLocalRandom.current().nextInt(10, 15);
        Integer[] integers = new Integer[size];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
        return integers;
    }

    public ArrayList<Integer> integerArrayListCreate(Integer[] integers) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, integers);
        return integerArrayList;
    }

    public ArrayList<Integer> numberRemover(ArrayList<Integer> integerArrayList) {
        ListIterator<Integer> integerListIterator = integerArrayList.listIterator();
        while (integerListIterator.hasNext()) {
            Integer num = integerListIterator.next();
            if (num % 3 == 0) {
                integerListIterator.remove();
            }
        }
        return integerArrayList;
    }

    @Override
    public String toString() {
        return Arrays.toString(integers);
    }
}


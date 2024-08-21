package collections.deletetask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class DeleteExample {
    public static void main(String[] args) {
        String stringNumbers = "33, 44, 66, 23, 13, 18, 91, 96";
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        String[] numbers = stringNumbers.split(", ");
        Integer[] integers = Arrays.stream(numbers).map(Integer::valueOf).toArray(Integer[]::new);
        for (Integer integer : integers) {
            integerArrayList.add(integer);
        }
        System.out.println(integerArrayList);
        ListIterator<Integer> integerListIterator = integerArrayList.listIterator();
        while (integerListIterator.hasNext()) {
            Integer num = integerListIterator.next();
            if (num % 3 == 0) {
                integerListIterator.remove();
            }
        }
        System.out.println(integerArrayList);
    }
}

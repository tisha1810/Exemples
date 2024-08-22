package collections.deletetask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class DeleteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");

        String stringNumbers = scanner.nextLine();

        String[] numbers = generateStringArray(stringNumbers);
        Integer[] integers = generateIntegerArray(numbers);

        ArrayList<Integer> integerArrayList = integerArrayListCreate(integers);
        System.out.println(integerArrayList);

        numberRemover(integerArrayList);
        System.out.println(integerArrayList);
    }

    public static String[] generateStringArray(String stringNumbers) {
        return stringNumbers.split(", ");
    }

    public static Integer[] generateIntegerArray(String[] numbers) {
        Integer[] integers = Arrays.stream(numbers).map(Integer::valueOf).toArray(Integer[]::new);
        return integers;
    }

    public static ArrayList<Integer> integerArrayListCreate(Integer[] integers) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (Integer integer : integers) {
            integerArrayList.add(integer);
        }
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

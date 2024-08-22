package collections.deletetask;

import java.util.*;

public class DeleteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");

        String stringNumbers = scanner.nextLine();

        System.out.println(stringNumbers);

        String[] numbers = generateStringArray(stringNumbers);
        Integer[] integers = generateIntegerArray(numbers);

        ArrayList<Integer> integerArrayList = integerArrayListCreate(integers);
        System.out.println(integerArrayList);

        numberRemover(integerArrayList);
        System.out.println(integerArrayList);
    }

    public static String[] generateStringArray(String stringNumbers) {
        return stringNumbers.split(" ");
    }

    public static Integer[] generateIntegerArray(String[] numbers) {
        return Arrays.stream(numbers).map(Integer::valueOf).toArray(Integer[]::new);
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

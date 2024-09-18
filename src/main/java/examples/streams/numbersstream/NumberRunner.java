package examples.streams.numbersstream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberRunner {
    public static void main(String[] args) {
        List<Integer> firstIntegerList = generateIntegerList();
        System.out.println("--- first list ---");
        System.out.println(firstIntegerList);

        List<Integer> secondIntegerList = generateIntegerList();
        System.out.println("--- second list ---");
        System.out.println(secondIntegerList);

        List<Integer> uniqueIntegerList = Stream.concat(firstIntegerList.stream(), secondIntegerList.stream())
                .distinct().sorted().collect(Collectors.toList());
        Set<Integer> uniqueIntegerSet = Stream.concat(firstIntegerList.stream(), secondIntegerList.stream())
                .collect(Collectors.toSet());
        System.out.println("--- unique lists ---");
        System.out.println(uniqueIntegerSet);
        System.out.println(uniqueIntegerList);

    }

    public static List<Integer> generateIntegerList() {
        int maxSize = 10;
        int[] array = new int[maxSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 20);
        }
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }
}

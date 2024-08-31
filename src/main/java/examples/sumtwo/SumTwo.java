package examples.sumtwo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SumTwo {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input target:");
        int target = scanner.nextInt();

        int[] arr = sumTwo(array, target);
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
    }

    public static int[] sumTwo(int[] array, int target) {
        int firstIndex = 0;
        int secondIndex = 0;
        int sum;
        for (int i = 0; i < array.length; i++) {
            firstIndex = i;
            secondIndex = i + 1;
            sum = array[i] + array[i + 1];
            if (sum == target) {
                break;
            }
        }
        return new int[]{firstIndex, secondIndex};
    }

}

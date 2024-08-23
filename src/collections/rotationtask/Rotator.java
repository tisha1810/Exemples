package collections.rotationtask;

import java.util.LinkedList;
import java.util.Scanner;

public class Rotator {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println("--- List ---");
        System.out.println(linkedList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input shifter:");
        int shift = scanner.nextInt();

        System.out.println("--- Rotation ---");
        shifter(linkedList, shift);
        System.out.println(linkedList);

    }

    public static void shifter(LinkedList<Integer> linkedList, int shift) {
        int i = linkedList.size();
        if (i == 0 || shift % i == 0) {
            return;
        }
        shift = shift % i;
        for (int j = 0; j < shift; j++) {
            int last = linkedList.removeLast();
            linkedList.addFirst(last);
        }
    }
}

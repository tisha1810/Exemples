package examples.collections.reversetask;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string:");

        String string = scanner.nextLine();
        System.out.println("--- String ---");
        System.out.println(string);
        String[] strings = string.split(" ");

        Stack<String> stringStack = new Stack<>();
        for (String str : strings) {
            stringStack.push(str);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stringStack.isEmpty()){
            stringBuilder.append(stringStack.pop()).append(" ");
        }
        System.out.println("--- Reversed ---");
        System.out.println(stringBuilder);
    }
}

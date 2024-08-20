package collections.reversetask;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String string = "Hello World";
        String[] strings = string.split(" ");

        System.out.println(string);

        Stack<String> stringStack = new Stack<>();
        for (String str : strings) {
            stringStack.push(str);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while(!stringStack.isEmpty()){
            stringBuilder.append(stringStack.pop()).append(" ");
        }
        System.out.println(stringBuilder);
    }
}

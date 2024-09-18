package examples.streams.convertliststirng;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Orange");
        stringList.add("Apple");
        stringList.add("Grape");
        stringList.add("Plum");
        stringList.add("Tomato");
        System.out.println(stringList);
        String[] strings = stringList.stream().toArray(String[]::new);
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}

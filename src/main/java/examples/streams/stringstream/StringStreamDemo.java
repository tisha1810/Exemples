package examples.streams.stringstream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("BMW", "Audi", "Mercedes", "Toyota", "Honda", "Mitsubishi");
        List<String> stringList2 = Arrays.asList("Apple", "Orange", "Onion", "Pinnacle", "Peach", "Pear");
        List<String> strings = Stream.concat(stringList.stream(), stringList2.stream())
                .filter(s -> s.toLowerCase().contains("a")).collect(Collectors.toList());
        System.out.println(strings);


        Map<Integer, List<String>> stringMap = stringList2.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(stringMap);
        ;
    }
}

package examples.streams.personstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Boris", "male", 44),
                new Person("Doris", "female", 33),
                new Person("Moris", "male", 29),
                new Person("Loris", "female", 23));
        personList.forEach(System.out::println);
        personList = personList.stream().filter(element -> element.getAge() > 30 & element.getSex().equals("male"))
                .collect(Collectors.toList());
        System.out.println("---- Filtered list ---- ");
        personList.forEach(System.out::println);
    }
}

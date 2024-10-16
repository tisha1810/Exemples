package examples.streams.personstream;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        List<Person> personList = Arrays.asList(
                new Person("Boris", "male", 44),
                new Person("Doris", "female", 33),
                new Person("Moris", "male", 29),
                new Person("Loris", "female", 23));
        personList.forEach(System.out::println);
        ObjectMapper objectMapper = new ObjectMapper();
        String persons = objectMapper.writeValueAsString(personList);
        System.out.println(persons);
        FileWriter personData = new FileWriter("Person DATA.json");
        personData.write(persons);
        personData.flush();
        personData.close();
    }
}

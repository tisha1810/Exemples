package examples.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person firstPerson = new Person("Boris", "Johnson", 55);
        String person = objectMapper.writeValueAsString(firstPerson);
        System.out.println(person);
        
    }
}

package examples.streams.animalstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalStreamRun {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Barsik", 2));
        animalList.add(new Animal("Garfield", 5));
        animalList.add(new Animal("Trieksie", 1));
        animalList.add(new Animal("Murzik", 6));
        animalList.add(new Animal("Kesha", 4));
        animalList.add(new Animal("Bagira", 3));
        animalList.forEach(System.out::println);
        List<String> filtredList = animalList.stream().filter(el -> el.getAge() > 3).map(Animal::getName)
                .collect(Collectors.toList());
        System.out.println("--- Filtered list ---");
        System.out.println(filtredList);
    }
}

package examples.streams.carstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarStreamRun {
    public static void main(String[] args) {
        List<Car> firstCarList = Arrays.asList(
                new Car("TOYOTA Prada", 33999),
                new Car("Tesla Model S", 22999),
                new Car("LADA Kalina", 1499),
                new Car("BMW X 6", 75999),
                new Car("Mercedes AMG 63", 120999));
        List<Car> secondCarList = Arrays.asList(
                new Car("TOYOTA Camry", 17999),
                new Car("HONDA Civic", 12999),
                new Car("Audi Q7", 80999),
                new Car("BMW series 7", 97999),
                new Car("Ford Focus", 11999)
        );
        System.out.println("--- First car list ---");
        firstCarList.forEach(System.out::println);

        System.out.println("--- Second car list ---");
        secondCarList.forEach(System.out::println);

        System.out.println("--- Filtered Lists ---");
        List<Car> filteredList = Stream.concat(firstCarList.stream().filter(element -> element.getPrice() < 25000),
                secondCarList.stream().filter(element -> element.getPrice() < 25000)).collect(Collectors.toList());
        filteredList = filteredList.stream().sorted(Comparator.comparingDouble(Car::getPrice))
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }

}

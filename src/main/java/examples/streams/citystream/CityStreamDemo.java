package examples.streams.citystream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityStreamDemo {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("New-York", "USA"));
        cityList.add(new City("London", "Great Britain"));
        cityList.add(new City("Rome", "Italy"));
        cityList.add(new City("Paris", "France"));
        cityList.add(new City("Berlin", "Germany"));
        cityList.add(new City("LA","USA"));
        cityList.add(new City("Tokio", "Japan"));
        cityList.forEach(System.out::println);
        String cities = cityList.stream().map(City::getName).collect(Collectors.joining(", "));
        System.out.println(cities);


    }
}



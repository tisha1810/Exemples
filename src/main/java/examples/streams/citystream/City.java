package examples.streams.citystream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City {
    private String name;
    private String country;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

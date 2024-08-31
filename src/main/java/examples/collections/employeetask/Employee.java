package examples.collections.employeetask;

import java.util.concurrent.ThreadLocalRandom;

public class Employee {
    private final String name;
    private final Integer age = ThreadLocalRandom.current().nextInt(18, 50);

    public Integer getAge() {
        return age;
    }

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name '" + name + '\'' +
                ", age " + age;
    }

}

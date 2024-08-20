package collections.taskemployee;

import java.util.ArrayList;

public class Employee extends ArrayList {
    private final String name;

    public Integer getAge() {
        return age;
    }

    private final Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name '" + name + '\'' +
                ", age " + age;
    }

}

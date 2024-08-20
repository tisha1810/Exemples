package collections.taskemployee;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Boris", 45);
        Employee secondEmployee = new Employee("Doris", 29);
        Employee thirdEmployee = new Employee("Noris", 22);
        Employee fourEmployee = new Employee("Storis", 31);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(fourEmployee);

        System.out.println("----- Unsorted List -----");
        System.out.println(employees);

        employees.sort(Comparator.comparingInt(Employee::getAge));

        System.out.println("----- Sorted list -----");
        System.out.println(employees);

    }
}

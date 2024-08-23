package collections.employeetask;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Boris");
        Employee secondEmployee = new Employee("Doris");
        Employee thirdEmployee = new Employee("Noris");
        Employee fourEmployee = new Employee("Storis");
        Employee fifthEmployee = new Employee("Loris");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(fourEmployee);
        employees.add(fifthEmployee);

        System.out.println("----- Unsorted List -----");
        System.out.println(employees);

        employees.sort(Comparator.comparingInt(Employee::getAge));

        System.out.println("----- Sorted list -----");
        System.out.println(employees);

    }
}

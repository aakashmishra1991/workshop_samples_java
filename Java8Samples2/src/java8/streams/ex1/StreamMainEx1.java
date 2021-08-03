package java8.streams.ex1;

import java8.streams.ex1.entity.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMainEx1 {
    //     filter() – select records based on some criteria
    //     map() – transform object into another object
    // MapReduce


    public static void main(String[] args) {
        final List<Employee> employeeList = Arrays.asList(
                new Employee(1, "x1", 4),
                new Employee(2, "x2", 5),
                new Employee(3, "x3", 5),
                new Employee(4, "x4", 6),
                new Employee(5, "x5", 6));

        // Java 8
        employeeList.forEach(StreamMainEx1::printEmployee);


        // filter
        System.out.println("Get all employees with level 5 and above");
        employeeList.stream()
                .filter(employee -> employee.getLevel() > 4)
                .collect(Collectors.toList())
                .forEach(StreamMainEx1::printEmployee);
        //
        System.out.println("What is the average of the levels of employees");
        Integer average = employeeList.stream()
                .map(Employee::getLevel)
                .reduce((integer, integer2) -> (integer + integer2) / 2)
                .get();
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();

        System.out.println(average.intValue());

        // reducing the elements
    }

    static void printEmployee(Employee e1) {
        System.out.println(e1.getId() + "-" + e1.getName() + "-" + e1.getLevel());
    }

}

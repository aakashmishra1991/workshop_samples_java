package java8.lambdas.ex6;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFunctions {

  public static void main(String[] args) {
    // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
    // Accumulate names into a List
    printAllEmployeeNames();

    //
    //      // Accumulate names into a TreeSet
    //      Set<String> set =
    // people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
    //
    //      // Convert elements to strings and concatenate them, separated by commas
    //      String joined = things.stream()
    //              .map(Object::toString)
    //              .collect(Collectors.joining(", "));
    //
    //      // Compute sum of salaries of employee
    //      int total = employees.stream()
    //              .collect(Collectors.summingInt(Employee::getSalary)));
    //
    //      // Group employees by department
    //      Map<Department, List<Employee>> byDept
    //              = employees.stream()
    //              .collect(Collectors.groupingBy(Employee::getDepartment));
    //
    //      // Compute sum of salaries by department
    //      Map<Department, Integer> totalByDept
    //              = employees.stream()
    //              .collect(Collectors.groupingBy(Employee::getDepartment,
    //                      Collectors.summingInt(Employee::getSalary)));
    //
    //      // Partition students into passing and failing
    //      Map<Boolean, List<Student>> passingFailing =
    //              students.stream()
    //                      .collect(Collectors.partitioningBy(s -> s.getGrade() >=
    // PASS_THRESHOLD));

  }

  private static void printAllEmployeeNames() {
    final List<String> employeeNameList =
        Employee.getMockedEmployeeList().stream()
            .map(Employee::getName)
            .collect(Collectors.toList());
    System.out.println("All employee name list -> "+employeeNameList);
  }
  private static void printAllEmployeeNames1() {
    final List<String> employeeNameList =
            Employee.getMockedEmployeeList().stream()
                    .map(Employee::getName)
                    .collect(Collectors.toList());
    System.out.println("All employee name list -> "+employeeNameList);
  }
}

package java8.lambdas.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeGroupedByGender {

  public static void main(String[] args) {
    // with collectors function
    final Map<Character, List<Employee>> employeeGenderMap =
        Employee.getMockedEmployeeList().stream().collect(Collectors.groupingBy(Employee::getGender));

    employeeGenderMap.forEach(
        (character, employee) -> System.out.println(character.charValue() + "-" + employee));
  }


}

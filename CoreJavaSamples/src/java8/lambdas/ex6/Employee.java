package java8.lambdas.ex6;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private Integer id;
  private Character gender;
  private String name;
  private Long salary;

  public Employee(Integer id, Character gender) {
    this.id = id;
    this.gender = gender;
  }

  public Employee(Integer id, Character gender, String name) {
    this.id = id;
    this.gender = gender;
    this.name = name;
  }

  public Employee(Integer id, Character gender, String name, Long salary) {
    this.id = id;
    this.gender = gender;
    this.name = name;
    this.salary = salary;
  }

  public Integer getId() {
    return id;
  }

  public Character getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public Long getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", gender=" + gender + '}';
  }

  public static List<Employee> getMockedEmployeeList() {
    final List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(1, 'M', "Ross", 10000L));
    employeeList.add(new Employee(2, 'F', "Joey", 20000L));
    employeeList.add(new Employee(3, 'M', "Emily", 10000L));
    employeeList.add(new Employee(4, 'F', "Rachel", 30000L));
    return employeeList;
  }
}

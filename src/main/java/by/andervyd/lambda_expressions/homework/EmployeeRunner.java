package by.andervyd.lambda_expressions.homework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Bob", "IT", 2600));
        employeeList.add(new Employee("Lee", "HR", 2100));
        employeeList.add(new Employee("Poll", "HR", 1300));
        employeeList.add(new Employee("Jack", "Manager", 3100));
        employeeList.add(new Employee("John", "IT", 2300));

        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.filterEmployee(employeeList, employee ->
                "IT".equals(employee.getDepartment())
                        && employee.getSalary() > 2000);
        System.out.println("==================================");
        employeeInfo.filterEmployee(employeeList, employee ->
                employee.getName().startsWith("J")
                        && employee.getSalary() != 2000);
    }
}

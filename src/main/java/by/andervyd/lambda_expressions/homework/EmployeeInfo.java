package by.andervyd.lambda_expressions.homework;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeInfo {

    public void filterEmployee(List<Employee> employeeList, Predicate<Employee> value) {
        for (Employee employee : employeeList) {
            if (value.test(employee)) {
                printEmployee(employee);
            }
        }
    }

    private void printEmployee(Employee employee) {
        System.out.println("Name: " + employee.getName()
                + ", department: " + employee.getDepartment()
                + ", salary: " + employee.getSalary());
    }
}

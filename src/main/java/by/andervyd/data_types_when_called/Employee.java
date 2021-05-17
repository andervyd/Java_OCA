package by.andervyd.data_types_when_called;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double salaryX2(double money) {
        return money * 2;
    }

    public double salaryX2Change() {
        return salary * 2;
    }


    @Override
    public String toString() {
        return "Employee | name: " + name
                + ", salary: " + salary + "$";
    }
}

class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", 2300);
        System.out.println(employee);

        System.out.println(employee.salaryX2(employee.salary));

        System.out.println(employee);

        employee.salary = employee.salaryX2(employee.salary);
        System.out.println(employee);

        employee.salaryX2Change();
        System.out.println(employee);
    }
}

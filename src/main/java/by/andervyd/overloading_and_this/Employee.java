package by.andervyd.overloading_and_this;

public class Employee {
    int id;
    String firstName;
    String lastName;
    double salary;
    String department;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int idE, String firstNameE, String lastNameE) {
        this(firstNameE, lastNameE);
        id = idE;
    }

    public Employee(String firstName, double salary, String department) {
        this(0, firstName, null, salary, department);
    }

    public Employee(int id, String firstName, String lastName, double salary, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }
}

class EmployeeRunner {
    public static void main(String[] args) {

        Employee bob = new Employee();
        Employee poll = new Employee(1, "Poll", "Anderson");
        Employee jack = new Employee("Jack", 2300, "HR");

    }
}

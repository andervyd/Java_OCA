package by.andervyd.constuctor_and_method.homework.task3;

public class Employee {
    int id;
    String surname;
    double salary;
    String department;

    public Employee(int id, String surname, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    double salaryIncreaseX2() {
        return salary *= 2;
    }

    void showInfo() {
        System.out.println("id: " + id + ", name: " + surname
                + ", salary: " + salary + "$, department: " + department);
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee firstEmployee = new Employee(1, "Poll", 1300, "IT");
        Employee secondEmployee = new Employee(2, "Jack", 940, "HR");

        firstEmployee.showInfo();
        secondEmployee.showInfo();

        System.out.println("New salary " + firstEmployee.surname + ": " + firstEmployee.salaryIncreaseX2() + "$");
        System.out.println("New salary " + secondEmployee.surname + ": " + secondEmployee.salaryIncreaseX2() + "$");
    }
}
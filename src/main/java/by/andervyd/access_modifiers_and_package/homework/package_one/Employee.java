package by.andervyd.access_modifiers_and_package.homework.package_one;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public Employee(int id) {
        this.id = id;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public void showId() {
        System.out.println("id: " + id);
    }

    public void showSurname() {
        System.out.println("surname: " + surname);
    }

    public void showSalary() {
        System.out.println("salary: " + salary);
    }
}



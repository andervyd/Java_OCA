package by.andervyd.overriding_hiding_final;

class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();

        Employee employee1 = new Doctor();
        Employee employee2 = new Surgeon();
        Doctor employee3 = new Surgeon();
        Surgeon surgeon = new Surgeon();

    }
}

public class Employee {
    String name;
    int age;
    int experience;
    double salary;

    void eat() {
        System.out.println("To eat");
    }

    void sleep() {
        System.out.println("To sleep");
    }
}

class Doctor extends Employee {

    void heals() {
        System.out.println("To heal");
    }
}

class Surgeon extends Doctor {

    void operation() {
        System.out.println("Make operation");
    }
}

class Teacher extends Employee {

    int numberOfStudents;

    void teaches() {
        System.out.println("Learn");
    }
}













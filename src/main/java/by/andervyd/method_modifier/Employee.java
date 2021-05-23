package by.andervyd.method_modifier;

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

class Doctor extends Employee implements Helper {

    void heals() {
        System.out.println("To heal");
    }

    @Override
    public void help() {
        System.out.println("Doctor's helping");
    }
}

class Teacher extends Employee implements Helper, Swimmer {

    int numberOfStudents;

    void teaches() {
        System.out.println("Learn");
    }

    @Override
    public void help() {
        System.out.println("Teacher's helping");
    }

    @Override
    public void swim() {
        System.out.println("Teacher's swimming");
    }
}

interface Helper {
    void help();
}

interface Swimmer {

    void swim();
}
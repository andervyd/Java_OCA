package by.andervyd.encapsulation_and_super_protected;

public class Employee {
    String name;
    String experience;

    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor extends Employee {

}

class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.name = "Bob";

    }
}
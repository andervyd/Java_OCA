package by.andervyd.polymorphism_and_instance_of;

public abstract class Employee {

    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee {

    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee {

    @Override
    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Helper {
    int salary = 100;

    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Helper {

    void help();
}

class Runner {
    public static void main(String[] args) {

        Driver[] drivers = {new Driver(), new Driver()};

        Employee[] employees = {new Teacher(), new Driver(), new Doctor()};

        for (Employee employee : employees) {
            employee.work();
        }

        System.out.println("====================");

        Employee employee1 = new Teacher();
        Employee employee2 = new Driver();
        Employee employee3 = new Doctor();

        Helper doctor = new Doctor();

        employee1.work();
        employee2.work();
        employee3.work();

        doctor.help();

        System.out.println("====================");

        System.out.println(employee1 instanceof Employee);
        System.out.println(doctor instanceof Employee);

        System.out.println("====================");

        Employee emp = new Doctor();
        Doctor doc = (Doctor) emp;
        System.out.println(doc.salary);

        System.out.println("====================");

        Employee e1 = new Teacher();
        Employee e2 = new Teacher();
        Employee e3 = new Doctor();
        Employee e4 = new Driver();
        Employee e5 = new Teacher();

        Employee[] array = {e1, e2, e3, e4, e5};
        for (Employee employee : array) {
            if (employee instanceof Teacher) {
                ((Teacher)employee).work();
            }
        }


    }
}
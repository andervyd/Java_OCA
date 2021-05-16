package by.andervyd.access_modifiers_and_package.homework.package_one;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee("Bob");
//        Employee emp3 = new Employee(1200.50);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);

        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
//        System.out.println(emp2.salary);

        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();

//        System.out.println(emp3.id);
//        System.out.println(emp3.surname);
//        System.out.println(emp3.salary);

//        emp3.showId();
//        emp3.showSurname();
//        emp3.showSalary();
    }
}

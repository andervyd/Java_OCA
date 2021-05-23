package by.andervyd.encapsulation_and_super_protected.homework.task2;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog dog = new Dog("Jack");
        System.out.println("Paw: " + dog.paw);

        Cat cat = new Cat("Bread");
        cat.sleep();
    }
}

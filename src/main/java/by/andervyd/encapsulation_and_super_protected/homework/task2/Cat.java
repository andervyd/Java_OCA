package by.andervyd.encapsulation_and_super_protected.homework.task2;

public class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I'm cat and my name: " + this.name);
    }

    public void sleep() {
        System.out.println("Cat sleeping");
    }
}

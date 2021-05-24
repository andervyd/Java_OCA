package by.andervyd.polymorphism_and_instance_of.homework;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

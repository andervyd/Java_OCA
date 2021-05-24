package by.andervyd.polymorphism_and_instance_of.homework;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Penguins can't fly");
    }

    @Override
    void eat() {
        System.out.println("Penguin loves to eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep huddled together");
    }

    @Override
    public void speak() {
        System.out.println("Penguins can't sing like nightingales");
    }
}

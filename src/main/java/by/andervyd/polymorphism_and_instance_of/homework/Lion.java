package by.andervyd.polymorphism_and_instance_of.homework;

public class Lion extends Mammal {

    public Lion(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Leo is not the fastest cat");
    }

    @Override
    void eat() {
        System.out.println("Leo, like any predator, loves meat!");
    }

    @Override
    void sleep() {
        System.out.println("The lion sleeps most of the day");
    }
}

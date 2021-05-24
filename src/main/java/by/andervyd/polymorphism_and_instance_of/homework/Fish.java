package by.andervyd.polymorphism_and_instance_of.homework;

public abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    abstract void swim();

    @Override
    void sleep() {
        System.out.println("It's always interesting to watch fish sleep");
    }
}

package by.andervyd.polymorphism_and_instance_of.homework;

public abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }

    abstract void run();
}

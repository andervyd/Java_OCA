package by.andervyd.encapsulation_and_super_protected.homework.task2;

public class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
        System.out.println("I'm dog and my name: " + this.name);
    }

    public void play() {
        System.out.println("Dog playing");
    }
}

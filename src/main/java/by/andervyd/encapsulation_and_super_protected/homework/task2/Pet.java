package by.andervyd.encapsulation_and_super_protected.homework.task2;


public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Pet running");
    }

    public void jump() {
        System.out.println("Pet jumping");
    }
}

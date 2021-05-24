package by.andervyd.polymorphism_and_instance_of.homework;

public interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}

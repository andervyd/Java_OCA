package by.andervyd.method_modifier.homework;

public interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}

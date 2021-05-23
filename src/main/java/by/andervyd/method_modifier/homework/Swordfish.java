package by.andervyd.method_modifier.homework;

public class Swordfish extends Fish {

    public Swordfish(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("The swordfish is not a predatory fish, it eats regular fish food");
    }

    @Override
    void swim() {
        System.out.println("Swordfish is a beautiful fish that swims quickly");
    }
}

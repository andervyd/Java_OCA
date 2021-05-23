package by.andervyd.overriding_hiding_final;

public class Food {
    String name;

    void eat() {
        System.out.println("Eating food");
    }
}

class Fruit extends Food {

    @Override
    void eat() {
        System.out.println("Eating fruit");
    }
}

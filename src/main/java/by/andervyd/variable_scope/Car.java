package by.andervyd.variable_scope;

public class Car {
    String color;                                  // instance or object variable
    String engine;
    static int count;                              // static variable

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void shoeColor() {
        System.out.println("Car color: " + color);
    }

    public void changeColor(String color) {        // "String color" parameter variable, visible in the method
        System.out.println("Car color changing");
        int carPrice = 5000;                       // local variable, visible in the method
        this.color = color;
        carPrice += 1000;
    }


}

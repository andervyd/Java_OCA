package by.andervyd.equals_and_tostring_wrapper;

import java.util.Objects;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Car) {
            Car car = (Car) object;
            return (color.equals(car.color) &&
                    engine.equals(car.engine));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engine);
    }

    @Override
    public String toString() {
        return "Car | color: " + color
                + ", engine: " + engine;
    }
}

class CarRun {
    public static void main(String[] args) {

        Car car1 = new Car("red", "V8");
        Car car2 = new Car("red", "V8");
        Car car3 = new Car("black", "V12");

        System.out.println(car1 == car2);      // false
        System.out.println(car1.equals(car2)); // before false
        System.out.println(car1.equals(car2)); // after true
        System.out.println(car1.equals(car3)); // false

        System.out.println(car1);
        System.out.println(car3);
    }
}

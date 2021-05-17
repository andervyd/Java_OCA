package by.andervyd.data_types_when_called.homework;

public class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

    public int changeCountDoor(int doorCount) {
        return this.doorCount = doorCount;
    }

    public static void  changeCarColor(Car carOne, Car carTwo) {
        String colorTemp = carOne.color;
        carOne.color = carTwo.color;
        carTwo.color = colorTemp;
    }

    @Override
    public String toString() {
        return "Car | color: " + color
                + ", engine: " + engine
                + ", door count: " + doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {

        Car carOne = new Car("red", "V8", 3);
        Car carTwo = new Car("black", "V12", 4);

        System.out.println(carOne + "\n" + carTwo);

        carOne.changeCountDoor(4);
        carTwo.changeCountDoor(2);
        Car.changeCarColor(carOne, carTwo);

        System.out.println(carOne + "\n" + carTwo);
    }
}

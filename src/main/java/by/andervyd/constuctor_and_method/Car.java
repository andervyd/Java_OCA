package by.andervyd.constuctor_and_method;

public class Car {
    String color;
    String engine;
    int speed;

    int gasPedal(int speedUp) {
        speed += speedUp;
        return speed;
    }

    int brakePedal(int speedDown) {
        speed -= speedDown;
        return speed;
    }

    void showInfo() {
        System.out.println("Color: " + color + ", engine: " + engine + ", speed: " + speed + "km/s");
    }
}

class CarRunner {
    public static void main(String[] args) {

        Car redCar = new Car();
        Car blackCar = new Car();

        redCar.color = "red";
        redCar.engine = "V6";
        redCar.speed = 85;

        blackCar.color = "black";
        blackCar.engine = "V12";
        blackCar.speed = 120;

        redCar.showInfo();
        blackCar.showInfo();

        redCar.gasPedal(15);
        blackCar.brakePedal(25);

        System.out.println("\nChanging speed:");
        System.out.println(redCar.speed + "km/s");
        System.out.println(blackCar.speed + "km/s");
    }
}

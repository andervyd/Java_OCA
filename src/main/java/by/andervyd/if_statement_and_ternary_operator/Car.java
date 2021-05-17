package by.andervyd.if_statement_and_ternary_operator;

public class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarRunner {
    public static void main(String[] args) {

        Car carOne = new Car(8, 4);
        Car carTwo = new Car(6, 5);

        if(carOne.doorCount > carTwo.doorCount) {
            if(carOne.engine > carTwo.engine) {
                System.out.println("The car one has more doors and a more powerful motor");
            } else {
                System.out.println("The car has one more doors but not a powerful motor");
            }
        } else {
            System.out.println("The car has one fewer doors");
        }
    }
}

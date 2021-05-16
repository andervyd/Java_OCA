package by.andervyd.constuctor_and_method;

class HumanRunner {
    public static void main(String[] args) {

        Human person = new Human();

        person.name = "Poll";
        person.car = new SportCar("porsche", "red", "V8");
        person.account = new BankAccount(1, "gold", 2300);

        person.showInfo();
    }
}

public class Human {
    String name;
    SportCar car;
    BankAccount account;

    void showInfo() {
        System.out.println("Name: " + name
                + "\nCar name: " + car.name + ", color: " + car.color + ", engine: " + car.engine
                + "\nAccount id: " + account.id + ", card name: " + account.cardName + ", balance: " + account.balance + "$");
    }
}

class SportCar {
    String name;
    String color;
    String engine;

    public SportCar(String name, String color, String engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }
}

class BankAccount {
    int id;
    String cardName;
    double balance;

    public BankAccount(int id, String cardName, double balance) {
        this.id = id;
        this.cardName = cardName;
        this.balance = balance;
    }
}

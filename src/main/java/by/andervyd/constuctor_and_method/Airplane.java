package by.andervyd.constuctor_and_method;

public class Airplane {
    int boardNumber;
    String nameCompany;
    int passengerCapacity;

    public Airplane() {
        System.out.println("Creating default constructor...");
    }

    public Airplane(int boardNumberA, String nameCompanyA, int passengerCapacityA) {
        System.out.println("Creating users constructor...");
        boardNumber = boardNumberA;
        nameCompany = nameCompanyA;
        passengerCapacity = passengerCapacityA;
    }
}

class AirplaneRunner {
    public static void main(String[] args) {

        Airplane defaultAirplane = new Airplane();

        Airplane airplane = new Airplane(3432, "BioOil", 245);
        System.out.println("Board number: " + airplane.boardNumber);
        System.out.println("Name company: " + airplane.nameCompany);
        System.out.println("Passenger capacity: " + airplane.passengerCapacity);
    }
}

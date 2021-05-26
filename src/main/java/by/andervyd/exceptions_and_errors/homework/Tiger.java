package by.andervyd.exceptions_and_errors.homework;

public class Tiger {

    public void eat(String food) throws NotMeatException {
        if (!food.equals("meat")) {
            throw new NotMeatException("Tiger not eats " + food);
        } else {
            System.out.println("Tiger eats meat");
        }
    }

    public void drink(String water) throws NotWaterException {
        if (!water.equals("water")) {
            throw new NotWaterException("Tiger not drinks " + water);
        } else {
            System.out.println("Tiger drinks water");
        }
    }
}

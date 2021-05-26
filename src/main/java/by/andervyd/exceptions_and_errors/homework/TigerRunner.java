package by.andervyd.exceptions_and_errors.homework;

public class TigerRunner {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();

        tiger.eat("meat");

        try{
            tiger.drink("water");

            try {
                tiger.drink("beer");
            } catch (NotWaterException exception) {
                System.out.println(exception.getMessage());
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

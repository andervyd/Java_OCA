package by.andervyd.exceptions_and_errors;

public class TryCatchFinally {
    public static void main(String[] args) {

        int[] array = {4, 5, 1};

        System.out.println("[1] Output value");
        try {
            System.out.println("[2] Start output");
            System.out.println(array[4]);
            System.out.println("[3] Array with index 4");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("[4] Catch exception:" + exception);
        } finally {
            System.out.println("[5] Return to work code");
        }
        System.out.println("[6] End code");
    }
}

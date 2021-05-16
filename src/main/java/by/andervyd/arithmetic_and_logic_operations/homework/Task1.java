package by.andervyd.arithmetic_and_logic_operations.homework;

public class Task1 {
    public static void main(String[] args) {

        int intVarOne = 5;
        int intVarTwo = 11;
        double doubleVarOne = 5.5;
        double doubleVarTwo = 1.3;
        long longVar = 20L;
        double result = 0;

        result = intVarTwo / doubleVarOne + doubleVarTwo % intVarOne - longVar;

        System.out.println("Result: " + result);
    }
}

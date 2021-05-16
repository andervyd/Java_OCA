package by.andervyd.arithmetic_and_logic_operations;

/**
 *      +	Addition
 *      -	Subtraction
 *      *	Multiplication
 *      /	Division
 *      %	Modulo Operation (Remainder after division)
 */

public class ArithmeticOperators {
    public static void main(String[] args) {

        // declare variables
        int a = 12, b = 5;
        System.out.println("a: " + a + ", b: " + b);

        // addition operator
        System.out.println("\na + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));
    }
}

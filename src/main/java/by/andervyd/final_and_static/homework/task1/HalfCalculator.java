package by.andervyd.final_and_static.homework.task1;

public class HalfCalculator {

    public static int multiplicationOfThreeNumbers(int numOne, int numTwo, int numTree) {
        return (numOne * numTwo * numTree);
    }

    public static void divisionOfTwoNumbers(int numOne, int numTwo) {
        System.out.println("Division result: " + (numOne / numTwo));
        System.out.println("The remainder: " + (numOne % numTwo));
    }
}

class CalculatorRunner {
    public static void main(String[] args) {

        System.out.println("Result of multiplication: " +
                HalfCalculator.multiplicationOfThreeNumbers(2,4,1));

        System.out.println("Result of multiplication: " +
                HalfCalculator.multiplicationOfThreeNumbers(6,2,6));

        HalfCalculator.divisionOfTwoNumbers(20,3);

        HalfCalculator.divisionOfTwoNumbers(126,5);
    }
}

package by.andervyd.if_statement_and_ternary_operator;

public class TernaryOperator {
    public static void main(String[] args) {

        // (boolean expression) ? (if true) : (if false)

        int one = 20;
        int two = 15;

        int maxOne = (one > two) ? one : two;
        System.out.println(maxOne);

        int maxTwo = (one < two) ? one : two;
        System.out.println(maxTwo);
    }
}

package by.andervyd.arithmetic_and_logic_operations;

/**
 * The increment/decrement operators can be applied
 * before (prefix) ++result or after (postfix) result++ the operand.
 */
public class UnaryOperators {
    public static void main(String[] args) {

        int varOne = 5;
        int varTwo = 8;

        System.out.println("varOne original:" + varOne);

        ++varOne;
        System.out.println("varOne increment prefix:" + varOne);

        varOne++;
        System.out.println("varOne increment postfix:" + varOne);

        System.out.println("varTwo original:" + varTwo);

        --varTwo;
        System.out.println("varTwo increment prefix:" + varTwo);

        varTwo--;
        System.out.println("varTwo increment postfix:" + varTwo);

    }
}

package by.andervyd.arithmetic_and_logic_operations;

/**
 *   && (Logical AND)	expression1 && expression2	true only if both expression1 and expression2 are true
 *   || (Logical OR)	expression1 || expression2	true if either expression1 or expression2 is true
 *   !  (Logical NOT)	!expression	true if expression is false and vice versa
 */

public class LogicalOperators {
    public static void main(String[] args) {

        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    }
}

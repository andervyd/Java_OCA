package by.andervyd.arithmetic_and_logic_operations;

/**
 *      ==	    Is Equal To	                3 == 5  returns false
 *      !=	    Not Equal To	            3 != 5  returns true
 *      >	    Greater Than	            3 > 5   returns false
 *      <	    Less Than	                3 < 5   returns true
 *      >=	    Greater Than or Equal To	3 >= 5  returns false
 *      <=	    Less Than or Equal To   	3 <= 5  returns false
 */

public class RelationalOperators {
    public static void main(String[] args) {

        // create variables
        int a = 7, b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true
    }
}

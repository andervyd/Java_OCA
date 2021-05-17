package by.andervyd.if_statement_and_ternary_operator;

public class ExampleEquals {
    public static void main(String[] args) {

        String st1 = "abs";
        String st2 = "abs";

        String st3 = st1;
        String st4 = st2;

        String st5 = new String("abs");
        String st6 = new String("abs");

        String st7 = st5;
        String st8 = st6;

        System.out.println(st1 == st2); // true
        System.out.println(st3 == st4); // true
        System.out.println(st5 == st6); // false
        System.out.println(st7 == st8); // false

        System.out.println(st1 == st5); // false

        System.out.println(st1.equals(st2)); // true
        System.out.println(st3.equals(st4)); // true
        System.out.println(st5.equals(st6)); // true
        System.out.println(st7.equals(st8)); // true
    }
}

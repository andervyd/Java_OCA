package by.andervyd.if_statement_and_ternary_operator;

public class ExampleIfStatement {
    public static void main(String[] args) {

        int num = 20;

        if(num > 5) {
            System.out.println(num + " > " + 5);
        }

        if(num > 5) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }


        if(num > 5) {
            System.out.println("It's true");
        } else if(num < 5) {
            System.out.println("It's false");
        } else {
            System.out.println("Nothing");
        }
    }
}

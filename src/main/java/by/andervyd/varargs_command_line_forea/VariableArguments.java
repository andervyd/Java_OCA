package by.andervyd.varargs_command_line_forea;

public class VariableArguments {

    public static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void sum(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println("Sum: " + (a + b + c + d));
    }

    // varargs
    public static void sum(int... a) {        // default => int[] a; only one varargs; only end
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }
}

class CheckSum {
    public static void main(String[] args) {

        VariableArguments.sum();
        VariableArguments.sum(2, 4);
        VariableArguments.sum(2, 4, 6);
        VariableArguments.sum(2, 4, 6, 8);
        VariableArguments.sum(2, 4, 6, 8, 10, 12);
    }
}
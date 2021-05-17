package by.andervyd.for_and_break_continue;

public class ExampleForLoop {
    public static void main(String[] args) {

//        for(initialization; condition; update) { expression; }

        for(int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }

        System.out.println();

        for(int i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n================");

        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.print(" " + i);
        }

        System.out.println("\n================");

        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.print(" " + i);
        }
    }
}

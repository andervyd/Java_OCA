package by.andervyd.while_and_do_while;

public class DoWhileExample {
    public static void main(String[] args) {

        int count = 0;
        do {
            count += 10;
            System.out.println("Count: " + count);
        } while (count <= 100);

        System.out.println("Count: " + count);
    }
}

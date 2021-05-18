package by.andervyd.string_all;

public class ChainingStringMethod {
    public static void main(String[] args) {

        String st1 = new String("hOW aRe n   ");
        String st2 = new String("ok?");

        String result = st1.trim().replace("n", "you ").
                concat(st2).toLowerCase().replace("?", " ");

        System.out.println(result);
    }
}

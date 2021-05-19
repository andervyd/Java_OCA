package by.andervyd.string_builder.homework;

public class CheckStringBuilder {

    public static boolean isTwoObjectEquals(StringBuilder sB1, StringBuilder sB2) {
        if (sB1.length() == sB2.length()) {
            if (sB1.toString().equals(sB2.toString()))
                return true;
        }
        return false;
    }
}

class CheckRunner {
    public static void main(String[] args) {

        StringBuilder sB1 = new StringBuilder("Hi");
        StringBuilder sB2 = new StringBuilder("Hi");
        StringBuilder sB3 = new StringBuilder("Hi!");

        System.out.println(
                CheckStringBuilder.isTwoObjectEquals(sB1, sB2));
        System.out.println(
                CheckStringBuilder.isTwoObjectEquals(sB1, sB3));
    }
}

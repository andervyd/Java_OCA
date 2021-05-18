package by.andervyd.string_all;

public class StringExample {
    String st1 = new String("Hi"); // creating new object
    String st2 = new String("Hi"); // creating new object

    String st3 = "Hi"; // creating object in string pool
    String st4 = "Hi"; // address int string pool
    String st5 = new String("Hi"); // creating new object (NOT check in string pool)
}

class CheckEquals {
    public static void main(String[] args) {

        String st1 = new String("Hi");
        String st2 = new String("Hi");
        System.out.println(st1 == st2); // false (check address)

        String st3 = "Hi";
        String st4 = "Hi";
        System.out.println("Hi" == st3); // "Hi" creating in string pool
        System.out.println(st3 == st4);  // true (check pool)

        char[] wordForString = {'G', 'o', 'o', 'd', ' ', 'd', 'a', 'y', '.'};
        String outputLine = new String(wordForString);
        System.out.println(outputLine);

    }
}

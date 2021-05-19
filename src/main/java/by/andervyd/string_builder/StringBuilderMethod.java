package by.andervyd.string_builder;

public class StringBuilderMethod {
    public static void main(String[] args) {

        StringBuilder stb1 = new StringBuilder("Hello");
        int length = stb1.length();
        System.out.println("Length StringBuilder: " + length);

        System.out.println("=====================");
        StringBuilder stb2 = new StringBuilder("Hello");
        char charIndex = stb2.charAt(0);
        System.out.println("Letter on index 0: " + charIndex);

        System.out.println("=====================");
        StringBuilder stb3 = new StringBuilder("Hello");
        int stringIndex = stb3.indexOf("e");
        int stringIndexPos = stb3.indexOf("e", 2);
        System.out.println(stringIndex + ", " + stringIndexPos);

        System.out.println("=====================");
        StringBuilder stb4 = new StringBuilder("some ToDo text");
        String st1 = stb4.substring(5);
        String st2 = stb4.substring(5, 10);
        System.out.println(stb4 + "\n" + st1 + "\n" + st2);

        System.out.println("=====================");
        StringBuilder stb5 = new StringBuilder("some ToDo text");
        CharSequence cs1 = stb5.subSequence(5, 10);
        System.out.println(stb5 + "\n" + cs1);

        System.out.println("=====================");
        StringBuilder stb6 = new StringBuilder("Date: ");
        stb6.append(21);
        System.out.println(stb6);
        stb6.append('.');
        System.out.println(stb6);

        System.out.println("=====================");
        StringBuilder stb7 = new StringBuilder("Date: ");
        stb7.insert(5, " 21");
        System.out.println(stb7);

        System.out.println("=====================");
        StringBuilder stb8 = new StringBuilder("Hellllo");
        System.out.println(stb8);
        stb8.delete(2, 4);
        System.out.println(stb8);

        System.out.println("=====================");
        StringBuilder stb9 = new StringBuilder("Hhello");
        System.out.println(stb9);
        stb9.deleteCharAt(1);
        System.out.println(stb9);

        System.out.println("=====================");
        StringBuilder stb10 = new StringBuilder("0123456789");
        System.out.println(stb10);
        stb10.reverse();
        System.out.println(stb10);

        System.out.println("=====================");
        StringBuilder stb11 = new StringBuilder("Hi my World");
        System.out.println(stb11);
        stb11.replace(3, 5, "our");
        System.out.println(stb11);

        System.out.println("=====================");
        StringBuilder stb12 = new StringBuilder();         // capacity default 16
        StringBuilder stb13 = new StringBuilder("012345"); // capacity default 16 + 6
        int capacityStb12 = stb12.capacity();
        int capacityStb13 = stb13.capacity();
        System.out.println("Capacity: " + capacityStb12 + ", " + capacityStb13);
    }
}

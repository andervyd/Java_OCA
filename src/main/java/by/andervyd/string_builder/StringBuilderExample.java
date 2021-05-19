package by.andervyd.string_builder;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder stb1 = new StringBuilder();           // capacity default 16
        StringBuilder stb2 = new StringBuilder(50); // capacity 50

        StringBuilder stb3 = new StringBuilder("Hi");

        char[] charForStB = {'H', 'i'};
        StringBuilder stb4 = new StringBuilder(String.valueOf(charForStB));

        StringBuilder stb5 = new StringBuilder(stb4);
    }
}

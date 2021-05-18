package by.andervyd.string_all;

public class StringMethod {
    public static void main(String[] args) {

        String st1 = new String("Hello");

        int stringLength = st1.length();
        System.out.println("Length: " + stringLength);

        System.out.println("===================");
        char index = st1.charAt(3);
        System.out.println("Char index in string: " + index);

        System.out.println("===================");
        int charIndex = st1.indexOf('e');
        int stringIndex = st1.indexOf("e");
        int charIndexPos = st1.indexOf('e', 2);
        int stringIndexPos = st1.indexOf("e", 2);
        System.out.println(charIndex + ", " + stringIndex + ", " + charIndexPos + ", " + stringIndexPos);

        System.out.println("===================");
        boolean isStartWith = st1.startsWith("H");
        boolean isStartWithFrom = st1.startsWith("H", 2);
        System.out.println("String start \"H\": " + isStartWith);
        System.out.println("String start \"H\" pos 2: " + isStartWithFrom);

        System.out.println("===================");
        boolean isEnd = st1.endsWith("H");
        System.out.println("String ends \"o\": " + isEnd);

        System.out.println("===================");
        String st2 = new String("some ToDo text");
        String st3 = st2.substring(5);
        String st4 = st2.substring(5, 10);
        System.out.println(st2 + "\n" + st3 + "\n" + st4);

        System.out.println("===================");
        String st5 = new String("   New   ");
        st5 = st5.trim();
        System.out.println(st5);

        System.out.println("===================");
        String st6 = new String("Good day.");
        String st7 = st6.replace('.', '!');
        String st8 = st7.replaceFirst("Good", "Bad");
        System.out.println(st6 + "\n" + st7 + "\n" + st8);

        System.out.println("===================");
        String st9 = new String("Some");
        String st10 = new String(" text");
        String st11 = st9.concat(st10);
        System.out.println(st11);

        System.out.println("===================");
        String st12 = new String("hEllO");
        String st13 = st12.toLowerCase();
        String st14 = st13.toUpperCase();
        System.out.println(st12 + "\n" + st13 + "\n" + st14);

        System.out.println("===================");
        boolean isCon = st11.contains("text");
        System.out.println(st11 + " contains word \"text\": " + isCon);
    }
}

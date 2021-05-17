package by.andervyd.for_and_break_continue;

public class TimeExample {

    public static void time() {
        OUTER:
        for (int hour = 8; hour <= 23; hour++) {
            INNER:
            for (int min = 0; min <= 59; min++) {
                if (hour <= 9) {
                    System.out.print("0" + hour);
                } else {
                    System.out.print(hour);
                }
                if (min <= 9) {
                    System.out.println(":0" + min);
                } else {
                    System.out.println(":" + min);
                }
            }
        }
    }

    public static void main(String[] args) {

        time();
    }
}

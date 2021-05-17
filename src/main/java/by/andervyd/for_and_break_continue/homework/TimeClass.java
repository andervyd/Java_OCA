package by.andervyd.for_and_break_continue.homework;

public class TimeClass {

    public static void time() {
        HOUR:
        for (int hour = 0; hour <= 6; hour++) {
            MIN:
            for (int min = 0; min <= 59; min++) {
                SEC:
                for (int sec = 0; sec <= 59; sec++) {
                    if (hour > 1 && min % 10 == 0) {
                        break HOUR;
                    } else if (sec * hour > min) {
                        continue MIN;
                    }

                    if (hour <= 9) {
                        System.out.print("0" + hour);
                    } else {
                        System.out.print(hour);
                    }
                    if (min <= 9) {
                        System.out.print(":0" + min);
                    } else {
                        System.out.print(":" + min);
                    }
                    if (sec <= 9) {
                        System.out.println(":0" + sec);
                    } else {
                        System.out.println(":" + sec);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        time();
    }
}

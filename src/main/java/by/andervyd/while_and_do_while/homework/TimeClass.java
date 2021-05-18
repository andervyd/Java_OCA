package by.andervyd.while_and_do_while.homework;

public class TimeClass {

    public static void time() {
        int hour = 0;

        HOUR:
        while (hour < 6) {
            int min = -1;
            MIN:
            do {
                min++;
                if (hour > 1 && min % 10 == 0) {
                    break HOUR;
                }
                int sec = 0;
                SEC:
                while (sec < 60) {
                    if (sec * hour > min) {
                        continue MIN;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
            } while (min < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}

package by.andervyd.constuction_switch.homework;

public class Month {
    public static void main(String[] args) {

        int monthNumber = 1;

        showMonthAndQuantityDays(monthNumber);
        showQuantityDaysInMonth(monthNumber);
    }

    public static void showMonthAndQuantityDays(int monthNumber) {
        switch(monthNumber) {
            case 1: System.out.println("January: 31 days");
                break;
            case 2: System.out.println("February: 28 days");
                break;
            case 3: System.out.println("March: 31 days");
                break;
            case 4: System.out.println("April: 30 days");
                break;
            case 5: System.out.println("May: 31 days");
                break;
            case 6: System.out.println("June: 30 days");
                break;
            case 7: System.out.println("July: 31 days");
                break;
            case 8: System.out.println("August: 31 days");
                break;
            case 9: System.out.println("September: 30 days");
                break;
            case 10: System.out.println("October: 31 days");
                break;
            case 11: System.out.println("November: 30 days");
                break;
            case 12: System.out.println("December: 31 days");
                break;
            default:
                System.out.println("Number of month not correctly");
        }

    }

    public static void showQuantityDaysInMonth(int monthNumber) {
        switch(monthNumber) {
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Days: 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Days: 31");
                break;
            case 2: System.out.println("Days: 28");
                break;
            default:
                System.out.println("Number of month not correctly");
        }
    }
}

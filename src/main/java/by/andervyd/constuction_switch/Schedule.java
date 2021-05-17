package by.andervyd.constuction_switch;

public class Schedule {
    public static void main(String[] args) {

        switch("Friday") {
            case "Sunday": System.out.println("We don't work");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday": System.out.println("We work: 9:00 - 18:00");
                break;
            case "Saturday": System.out.println("We work: 11:00 - 16:00");
                break;
            default: System.out.println("Not correctly week");
        }
    }
}

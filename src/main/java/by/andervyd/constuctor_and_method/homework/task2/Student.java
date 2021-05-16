package by.andervyd.constuctor_and_method.homework.task2;

public class Student {
    int ticketId;
    String firstName;
    String lastName;
    int yearOfStudy;
    double avgScoreMath;
    double avgScoreEconomics;
    double avgScoreForeignLang;

    public Student(int ticketId, String firstName, String lastName, int yearOfStudy,
                   double avgScoreMath, double avgScoreEconomics, double avgScoreForeignLang) {
        this.ticketId = ticketId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.avgScoreMath = avgScoreMath;
        this.avgScoreEconomics = avgScoreEconomics;
        this.avgScoreForeignLang = avgScoreForeignLang;
    }

    double averageScore(double math, double economics, double foreignLang) {
        double result = Math.ceil((math + economics + foreignLang) / 3);
        return result;
    }

    void showInfo() {
        System.out.println("Name: " + firstName + " " + lastName + ", average score: "
                + averageScore(avgScoreMath, avgScoreEconomics, avgScoreForeignLang));

    }
}

class StudentTest {
    public static void main(String[] args) {

        Student stBob = new Student(1, "Bob", "Crew", 2008,
                87.4, 79.2, 91.6);
        Student stPoll = new Student(2, "Mark", "Simon", 2012,
                56.1, 98.2, 87.3);
        Student stMark = new Student(3, "Poll", "Black", 2001,
                98.8, 97.3, 76.1);

        stBob.showInfo();
        stMark.showInfo();
        stPoll.showInfo();
    }
}

package by.andervyd.class_and_object.homework;

public class Student {
    int ticketId;
    String firstName;
    String lastName;
    int yearOfStudy;
    double avgScoreMath;
    double avgScoreEconomics;
    double avgScoreForeignLang;
}

class StudentTest {
    public static void main(String[] args) {

        Student stBob = new Student();
        Student stPoll = new Student();
        Student stMark = new Student();

        stBob.ticketId = 1;
        stBob.firstName = "Bob";
        stBob.lastName = "Crew";
        stBob.yearOfStudy = 2008;
        stBob.avgScoreMath = 87.4;
        stBob.avgScoreEconomics = 79.2;
        stBob.avgScoreForeignLang = 91.6;

        stMark.ticketId = 2;
        stMark.firstName = "Mark";
        stMark.lastName = "Simon";
        stMark.yearOfStudy = 2012;
        stMark.avgScoreMath = 56.1;
        stMark.avgScoreEconomics = 98.2;
        stMark.avgScoreForeignLang = 87.3;

        stPoll.ticketId = 3;
        stPoll.firstName = "Poll";
        stPoll.lastName = "Black";
        stPoll.yearOfStudy = 2001;
        stPoll.avgScoreMath = 98.8;
        stPoll.avgScoreEconomics = 97.3;
        stPoll.avgScoreForeignLang = 76.1;

        System.out.println("Name: " + stBob.firstName + " " + stBob.lastName + ", average score: "
                + Math.ceil((stBob.avgScoreMath + stBob.avgScoreEconomics + stBob.avgScoreForeignLang) / 3));

        System.out.println("Name: " + stMark.firstName + " " + stMark.lastName + ", average score: "
                + Math.ceil((stMark.avgScoreMath + stMark.avgScoreEconomics + stMark.avgScoreForeignLang) / 3));

        System.out.println("Name: " + stPoll.firstName + " " + stPoll.lastName + ", average score: "
                + Math.ceil((stPoll.avgScoreMath + stPoll.avgScoreEconomics + stPoll.avgScoreForeignLang) / 3));
/*
        Name: Bob Crew, average score: 87.0
        Name: Mark Simon, average score: 81.0
        Name: Poll Black, average score: 91.0
*/
    }
}

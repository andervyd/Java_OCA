package by.andervyd.constuction_switch;

public class Student {
    double grade;

    public Student(double grade) {
        this.grade = grade;
    }
}

class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student(4);
/*
        if(student.grade <= 2) {
            System.out.println("Grade's bad");
        } else if(student.grade == 3) {
            System.out.println("Grade's not bad");
        } else if(student.grade == 4) {
            System.out.println("Grade's good");
        } else {
            System.out.println("Grade's nice");
        }
*/
        switch((int)student.grade) {
            case 2:
                System.out.println("Grade's bad");
                break;
            case 3:
                System.out.println("Grade's not bad");
                break;
            case 4:
                System.out.println("Grade's good");
                break;
            default:
                System.out.println("Grade's nice");
        }

    }
}

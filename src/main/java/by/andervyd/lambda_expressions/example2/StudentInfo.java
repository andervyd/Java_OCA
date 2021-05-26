package by.andervyd.lambda_expressions.example2;

import java.util.List;

public class StudentInfo {

    public void printAboutStudent(Student student) {
        System.out.println("Name: " + student.getName()
                + ", age: " + student.getAge()
                + ", course: " + student.getCourse()
                + ", average grade: " + student.getAvgGrade());
    }

    public void printStudentWithOverGrade(List<Student> studentList, CheckStudent avgGrade) {
        for (Student student : studentList) {
            if (avgGrade.isStudent(student)) {
                printAboutStudent(student);
            }
        }
    }

    public void printStudentWithUnderGrade(List<Student> studentList, CheckStudent avgGrade) {
        for (Student student : studentList) {
            if (avgGrade.isStudent(student)) {
                printAboutStudent(student);
            }
        }
    }
}

package by.andervyd.lambda_expressions.example3;

import java.util.List;

public class StudentInfo {

    public void printAboutStudent(Student student) {
        System.out.println("Name: " + student.getName()
                + ", age: " + student.getAge()
                + ", course: " + student.getCourse()
                + ", average grade: " + student.getAvgGrade());
    }

    public void printStudentCheck(List<Student> studentList, CheckStudent avgGrade) {
        for (Student student : studentList) {
            if (avgGrade.isStudent(student)) {
                printAboutStudent(student);
            }
        }
    }
}

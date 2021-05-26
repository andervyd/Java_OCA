package by.andervyd.lambda_expressions.example1;

import java.util.List;

public class StudentInfo {

    public void printAboutStudent(Student student) {
        System.out.println("Name: " + student.getName()
                + ", age: " + student.getAge()
                + ", course: " + student.getCourse()
                + ", average grade: " + student.getAvgGrade());
    }

    public void printStudentWithOverGrade(List<Student> studentList, double avgGrade) {
        for (Student student : studentList) {
            if (student.getAvgGrade() > avgGrade) {
                printAboutStudent(student);
            }
        }
    }

    public void printStudentWithUnderGrade(List<Student> studentList, double avgGrade) {
        for (Student student : studentList) {
            if (student.getAvgGrade() < avgGrade) {
                printAboutStudent(student);
            }
        }
    }

    public void printStudentWithOverAge(List<Student> studentList, int age) {
        for (Student student : studentList) {
            if (student.getAge() > age) {
                printAboutStudent(student);
            }
        }
    }

    public void printStudentWithUnderAge(List<Student> studentList, int age) {
        for (Student student : studentList) {
            if (student.getAge() < age) {
                printAboutStudent(student);
            }
        }
    }
}

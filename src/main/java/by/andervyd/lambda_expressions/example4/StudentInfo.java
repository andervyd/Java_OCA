package by.andervyd.lambda_expressions.example4;

import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {

    public void printAboutStudent(Student student) {
        System.out.println("Name: " + student.getName()
                + ", age: " + student.getAge()
                + ", course: " + student.getCourse()
                + ", average grade: " + student.getAvgGrade());
    }

    public void printStudentCheck(List<Student> studentList, Predicate<Student> value) {
        for (Student student : studentList) {
            if (value.test(student)) {
                printAboutStudent(student);
            }
        }
    }
}

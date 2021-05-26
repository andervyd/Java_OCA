package by.andervyd.lambda_expressions.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentRunner {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bob", 26, 3, 87.4));
        studentList.add(new Student("Lee", 32, 4, 97.1));
        studentList.add(new Student("Jack", 21, 6, 84.2));
        studentList.add(new Student("John", 23, 1, 91.5));
        studentList.add(new Student("Poll", 29, 1, 76.6));

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentCheck(studentList,
                (Student student) -> {return student.getAvgGrade() > 85;});

        System.out.println("\nAll students name:");
        for (Student student : studentList) {
            System.out.print(student.getName() + " ");
        }

        System.out.println("\n\nDelete name witch letter start 'L'");
        studentList.removeIf(filter -> filter.getName().startsWith("J"));

        System.out.println("\nNew output name");
        for (Student student : studentList) {
            System.out.print(student.getName() + " ");
        }
    }
}

package by.andervyd.if_statement_and_ternary_operator.homework;

import java.util.Objects;

public class Student {
    int id;
    String name;
    int course;

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public static void checkStudentForEquals(Student studentOne, Student studentTwo) {
        if(studentOne.id == studentTwo.id &&
                studentOne.name.equals(studentTwo.name) &&
                studentOne.course == studentTwo.course) {
            System.out.println("Student one and student two have equals");
        } else {
            System.out.println("Student one and student two haven't equals");
        }
    }

    public static void checkAllInstanceOfStudent(Student studentOne, Student studentTwo) {
        if(studentOne.id == studentTwo.id) {
            if(studentOne.name.equals(studentTwo.name)) {
                if(studentOne.course == studentTwo.course) {
                    System.out.println("Student one and student two have equals");
                } else {
                    System.out.println("First student's course does not match");
                }
            } else {
                System.out.println("First student's name does not match");
            }
        } else {
            System.out.println("First student's id does not match");
        }
    }

    @Override
    public String toString() {
        return "Student | id: " + id
                + ", name: " + name
                + ", course: " + course;
    }
}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student(1, "John", 4);
        Student student2 = new Student(1, "John", 4);
        Student student3 = new Student(1, "John", 5);
        Student student4 = new Student(1, "Bob", 5);
        Student student5 = new Student(2, "Bob", 5);

        Student.checkStudentForEquals(student1, student1);
        Student.checkStudentForEquals(student1, student2);
        Student.checkStudentForEquals(student2, student3);
        Student.checkStudentForEquals(student3, student4);
        Student.checkStudentForEquals(student4, student5);

        System.out.println("========================");

        Student.checkAllInstanceOfStudent(student1, student1);
        Student.checkAllInstanceOfStudent(student1, student2);
        Student.checkAllInstanceOfStudent(student2, student3);
        Student.checkAllInstanceOfStudent(student3, student4);
        Student.checkAllInstanceOfStudent(student4, student5);
    }
}
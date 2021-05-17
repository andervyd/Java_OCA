package by.andervyd.data_types_when_called;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swapObject(Student studentOne, Student studentTwo) { // Don't work
        Student studentTemp = studentOne;
        studentOne = studentTwo;
        studentTwo = studentTemp;
    }

    @Override
    public String toString() {
        return "Student | name: " + name
                + ", course: " + course
                + ", grade: " + grade;
    }

    public static void main(String[] args) {

        Student studentOne = new Student("Poll", 3, 87.4);
        Student studentTwo = new Student("Jack", 4, 79.8);

        System.out.println("Original students: ");
        System.out.println(studentOne);
        System.out.println(studentTwo);

        Student studentTemp = studentOne;
        studentOne = studentTwo;
        studentTwo = studentTemp;

        System.out.println("\nChanging students:");
        System.out.println(studentOne);
        System.out.println(studentTwo);

        swapObject(studentOne, studentTwo);
        System.out.println("\nDon't change: ");
        System.out.println(studentOne);
        System.out.println(studentTwo);

    }
}

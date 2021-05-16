package by.andervyd.final_and_static.static_examp;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student #" + count + " is creating.");
    }

    public static void showCount() {
        System.out.println("Count: " + count);
    }
}

class StudentRunner {
    public static void main(String[] args) {

        Student studentOne =  new Student("Bob", 3);
        Student studentTwo =  new Student("Jack", 2);
        Student studentTree = new Student("Mark", 3);

        Student.showCount();
    }
}


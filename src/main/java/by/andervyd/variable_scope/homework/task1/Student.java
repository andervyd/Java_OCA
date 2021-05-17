package by.andervyd.variable_scope.homework.task1;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class CreateObject {
    public static void main(String[] args) {

        Student st1 = new Student(1, "Bob");
        Student st2 = new Student(2, "Lee");
        Student st3 = new Student(3, "Jack");
        Student st4 = new Student(4, "Mark");
        Student st5 = st1;
        Student st6 = st2;
        Student st7 = st5;
        Student st8 = st6;

        st1 = null;
        st2 = new Student(8,"Rob");
        st2 = st1;
    }
}

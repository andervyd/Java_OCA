package by.andervyd.encapsulation_and_super_protected.homework.task1;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public StringBuilder getName() {
        StringBuilder name = new StringBuilder(this.name);
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 1 && course <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Name: " + getName()
                + ", course: " + getCourse()
                + ", grade: " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName(new StringBuilder("Jack"));
        student.setCourse(3);
        student.setGrade(8.5);

        student.showInfo();
    }
}

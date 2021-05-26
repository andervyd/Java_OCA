package by.andervyd.lambda_expressions.example2;

public class CheckStudentUnderGrade implements CheckStudent {
    @Override
    public boolean isStudent(Student student) {
        return student.getAvgGrade() < 85;
    }
}

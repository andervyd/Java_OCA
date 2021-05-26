package by.andervyd.exceptions_and_errors;

public class CreateNewException extends Exception {

    public CreateNewException() {
    }

    public CreateNewException(String message) {
        super(message);
    }
}

class RunnerTest {
    public static void main(String[] args) throws CreateNewException {

        int temp = 5;

        if (temp > 3) {
            throw new CreateNewException("Something wrong: " + temp);
        }
    }
}

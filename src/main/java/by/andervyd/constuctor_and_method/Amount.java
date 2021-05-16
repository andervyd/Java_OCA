package by.andervyd.constuctor_and_method;

public class Amount {

    int totalNumber(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int averageNumber(int a, int b, int c) {
        int result = totalNumber(a, b, c) / 3;
        return result;
    }
}

class AmountRunner {
    public static void main(String[] args) {
        int result;

        Amount amount = new Amount();

        result = amount.totalNumber(7, 3, 10);
        System.out.println("The result of the \"totalNumber\" method: " + result);

        result = amount.averageNumber(5, 10, 15);
        System.out.println("The result of the \"averageNumber\" method: " + result);
    }
}

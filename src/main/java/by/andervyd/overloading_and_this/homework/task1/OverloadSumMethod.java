package by.andervyd.overloading_and_this.homework.task1;

public class OverloadSumMethod {

    int sum() {
        int result = 0;
        System.out.println("Sum all numbers: " + result);
        return result;
    }

    int sum(int var1) {
        int result = var1;
        System.out.println("Sum all numbers: " + result);
        return result;
    }

    int sum(int var1, int var2) {
        int result = var1 + var2;
        System.out.println("Sum all numbers: " + result);
        return result;
    }

    int sum(int var1, int var2, int var3) {
        int result = var1 + var2 + var3;
        System.out.println("Sum all numbers: " + result);
        return result;
    }

    int sum(int var1, int var2, int var3, int var4) {
        int result = var1 + var2 + var3 + var4;
        System.out.println("Sum all numbers: " + result);
        return result;
    }
}

class OverloadSumMethodTest {
    public static void main(String[] args) {

        OverloadSumMethod method = new OverloadSumMethod();

        method.sum();

        method.sum(5);

        method.sum(5, 6);

        method.sum(5, 6, 2);

        method.sum(5, 6, 2, 8);
    }
}

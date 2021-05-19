package by.andervyd.work_with_array;

public class ArrayInitialisation {
    public static void main(String[] args) {

        int[] intArr1;
        intArr1 = new int[5];
        int[] intArr2 = new int[5];
        int[] intArr3 = {4, 1, 4, 6, 2};

        int[][] intArr4 = new int[3][];
        int[][] intArr5 = new int[][]{{1, 2, 3}, {4}, {5, 6}};

        int[] intArr6 = new int[]{1,2};
        int[] intArr7 = new int[2];
        intArr7[0] = 1;
        intArr7[1] = intArr6[1];

        String[] stArr1;
        stArr1 = new String[3];
        String[] stArr2 = new String[3];
        String[] stArr3 = {"Hi", "By", "OK"};

        String[] stArr4 = new String[2];
        stArr4[0] = "Hi";
        stArr4[1] = "By";

        double[][] dbArr1;
        dbArr1 = new double[2][5];
        double[][] dbArr2 = new double[2][5];
        double[][] dbArr3 = {{2.1, 3, 4.2, 6.9, 8},
                {4, 7, 1.2, 4.9, 76}};

        Car carOne = new Car(1,"red");
        Car carTwo = new Car(2,"black");
        Car[] carArr = {carOne, carTwo};
    }
}

class Car {
    int id;
    String color;

    public Car(int id, String color) {
        this.id = id;
        this.color = color;
    }
}
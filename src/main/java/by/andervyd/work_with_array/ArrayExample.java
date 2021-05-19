package by.andervyd.work_with_array;

public class ArrayExample {
    public static void main(String[] args) {

        int[] intArr1 = new int[5];

        for (int i = 0; i < intArr1.length; i++) {
            intArr1[i] = i * 2;
            System.out.print(intArr1[i] + " ");
        }

        System.out.println("\n===============");

        int[][] intArr2 = new int[3][];
        intArr2[0] = new int[4];
        intArr2[1] = new int[2];
        intArr2[2] = new int[6];

        for (int i = 0; i < intArr2.length; i++) {
            for (int j = 0; j < intArr2[i].length; j++) {
                intArr2[i][j] = i * 2;
                System.out.print(intArr2[i][j]);
            }
            System.out.println();
        }


    }
}

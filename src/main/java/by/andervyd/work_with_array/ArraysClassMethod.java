package by.andervyd.work_with_array;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        int[] intArr = {3, 1, -6, 9, 0, -2};

        System.out.println("================");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\n================");
        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\n================");
        int positionVar = Arrays.binarySearch(intArr, 9); // only for sort array
        System.out.println("Position num 9: " + positionVar);






        System.out.println("\n================");
        System.out.println("\n================");
        System.out.println("\n================");
        System.out.println("\n================");
        System.out.println("\n================");
        System.out.println("\n================");
    }
}

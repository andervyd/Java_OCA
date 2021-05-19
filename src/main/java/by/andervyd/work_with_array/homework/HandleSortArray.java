package by.andervyd.work_with_array.homework;

import java.util.Arrays;

public class HandleSortArray {

    public static void sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] array = {3, -1, 7, 0, -5, 2};

        sortArray(array);
    }
}


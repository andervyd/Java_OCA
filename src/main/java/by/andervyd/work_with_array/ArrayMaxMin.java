package by.andervyd.work_with_array;

public class ArrayMaxMin {

    public static void searchMaxMinArray(double[] array) {
        double maxValue = array[0];
        double minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Max value: " + maxValue + "\nMin value: " + minValue);
    }

    public static void main(String[] args) {

        double[] array = {2, 4.1, 6.8, 9, 5.4};

        searchMaxMinArray(array);
    }
}

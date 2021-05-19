package by.andervyd.varargs_command_line_forea;

public class ForeachExample {
    public static void main(String[] args) {

        String[] arr = {"Hi", "By", "OK"};

        for (String result : arr) {
            System.out.print(result + " ");
        }

        System.out.println("\n====================");
        int[] intArr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int result : intArr) {
            sum += result;
        }
        System.out.println("Sum intArr: " + sum);

        System.out.println("\n====================");
        String[] arr1 = {"Hi", "Bye"};
        String[] arr2 = {"Bob", "Mike", "Jack"};

        for (String say : arr1) {
            for (String name : arr2) {
                System.out.println(say + " " + name);
            }
        }
        System.out.println("\n====================");
        int[][] intArr2 = {{2, 5, 1}, {7, 6}, {4, 9, 1, 6}};

        for (int[] arrayOne : intArr2) {
            for (int arrayTwo : arrayOne) {
                System.out.print(arrayTwo + " ");
            }
            System.out.println();
        }
        System.out.println("\n====================");
        int[] array = {5, 3, 9, 1, 0, 4};
        for (int arrays : array) {
            arrays = 0;               // don't work
        }
    }
}

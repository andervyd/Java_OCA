package by.andervyd.varargs_command_line_forea;

import java.util.Arrays;

public class CreatingOneArray {

    public static String[] addArray(String[]... array) {
        int lengthNewArray = 0;
        for (String[] arrays : array) {
            lengthNewArray += arrays.length;
        }
        String[] creatingNewArray = new String[lengthNewArray];
        int countObject = 0;
        for (String[] arrays : array) {
            for (String newArrays : arrays) {
                creatingNewArray[countObject] = newArrays;
                countObject++;
            }
        }
        return creatingNewArray;
    }
}

class CreateOneArrayRunner {
    public static void main(String[] args) {

        String[][] checkArray = {{"Hi", "Bye", "OK"}, {"Jack", "Poll", "John"}};

        String[] oneArray = CreatingOneArray.addArray(checkArray);
        System.out.println(Arrays.toString(oneArray));
    }
}

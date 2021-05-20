package by.andervyd.array_list.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandleSort {

    public static List<String> sortArrayList(String... arrayInput) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = 1; j < arrayInput.length; j++) {
                if (arrayInput[i].equalsIgnoreCase(arrayInput[j])) {
                    if (!list.contains(arrayInput[i])) {
                        list.add(arrayInput[i]);
                    }
                }
            }
        }
        Collections.sort(list);
        return list;
    }

    public static List<String> sortHandleArrayList(String... arrayInput) {
        List<String> list = new ArrayList<>();
        for (String string : arrayInput) {
            if (!list.contains(string)) {
                list.add(string);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {

        String[] strings = {"Hi", "Bye", "OK", "Done", "Hi", "End", "OK"};

        List<String> arrayList = sortArrayList(strings);
        System.out.println(arrayList);

        List<String> arrayListTwo = sortHandleArrayList(strings);
        System.out.println(arrayListTwo);
    }
}


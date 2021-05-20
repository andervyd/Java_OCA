package by.andervyd.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {

        System.out.println("\n========================");
        ArrayList<String> list1 = new ArrayList<>();
        String st1 = "Hi";
        list1.add(st1);
        list1.add(1, st1);
        System.out.println(list1);

        System.out.println("\n========================");
        String outputList = list1.get(0);
        System.out.println(outputList);

        System.out.println("\n========================");
        list1.set(1, "Bye");
        System.out.println(list1);

        System.out.println("\n========================");
        list1.add("OK");
        list1.add("NOT");
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.remove("OK");
        System.out.println(list1);

        System.out.println("\n========================");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("OK");
        list2.add("Hi");
        list2.add("Done");
        list1.addAll(list2);
        System.out.println(list1);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Bob");
        list3.add("Lee");
        list1.addAll(1, list3);
        System.out.println(list1);

        System.out.println("\n========================");
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("OK");
        list4.add("Hi");
        System.out.println(list4);
        list4.clear();
        System.out.println(list4);

        System.out.println("\n========================");
        ArrayList<String> list5 = new ArrayList<>();
        list5.add("OK");
        list5.add("Hi");
        list5.add("Bob");
        list5.add("Lee");
        int index = list5.indexOf("Hi");
        System.out.println(index);
        index = list5.lastIndexOf("Bob");
        System.out.println(index);

        System.out.println("\n========================");
        System.out.println(list5.size());

        System.out.println("\n========================");
        System.out.println(list5.isEmpty());
        System.out.println(list4.isEmpty());

        System.out.println("\n========================");
        boolean isObjectHere = list5.contains("Hi");
        System.out.println(isObjectHere);

        System.out.println("\n========================");
        System.out.println(list5.toString());

        System.out.println("\n========================");
        System.out.println("Is empty: " + list4);
//        ArrayList<String> cloneList5 = (ArrayList<String>) list5.clone();
        Object cloneList5 = list5.clone();
        System.out.println(cloneList5);

        System.out.println("\n========================");
        Object[] toArray = list2.toArray();
        System.out.println(Arrays.toString(toArray));
        String[] atArray = list1.toArray(new String[2]);
        System.out.println("toArray" + Arrays.toString(atArray));

        System.out.println("\n========================");
        ArrayList<String> list6 = new ArrayList<>();
        String st2 = ("OK");
        String st3 = ("Hi");
        List<String> arrayLists = Arrays.asList(st1, st2, st3);
        System.out.println(arrayLists);

        System.out.println("\n========================");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("\n========================");
        boolean isEquals = list1.equals(list2);
        System.out.println(isEquals);
    }
}

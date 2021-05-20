package by.andervyd.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (String letters : list) {
            System.out.print(letters + " ");
        }

        System.out.println();
        System.out.println(list);

        Iterator<String> iteratorList = list.iterator();
        while (iteratorList.hasNext()) {
            System.out.print(iteratorList.next() + " ");
        }

        System.out.println();
        ListIterator<String> listIteratorList = list.listIterator();
        while (listIteratorList.hasNext()) {
            System.out.print(listIteratorList.next() + " ");
        }
    }
}

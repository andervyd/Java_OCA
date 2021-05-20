package by.andervyd.array_list;

import by.andervyd.constuctor_and_method.Car;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList listObject = new ArrayList();
        listObject.add("Hi");

        Car car = new Car();
        listObject.add(car);

        int i = 12;
        listObject.add(i);

        System.out.println("=========================");
        ArrayList<String> stringList = new ArrayList<>();
        String st1 = "Hi";
        String st2 = "Bye";
        String st3 = "OK";
        stringList.add(st1);
        stringList.add(st2);
        stringList.add(st3);
    }
}

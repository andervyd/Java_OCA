package by.andervyd.equals_and_tostring_wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    Byte      aByte    = 2;    // byte
    Short     aShort   = 4;    // short
    Integer   integer  = 10;   // int
    Long      aLong    = 15L;  // long
    Float     aFloat   = 2.3f; // float
    Double    aDouble  = 3.4;  // double
    Character aChar    = 'A';  // char
    Boolean   aBoolean = true; // boolean
}

class Example {
    public static void main(String[] args) {

        System.out.println("\n==== Autoboxing and Unboxing ====");
        List<Integer> list = new ArrayList<>();
        list.add(7);

        int var = list.get(0);

        System.out.println(list + "\n" + var);

        System.out.println("\n==== Parse ====");
        String st = "50";
        int stInt = Integer.parseInt(st);

        System.out.println("String: " + st + "\n" + "int :" + stInt);

        System.out.println("\n==== valueOf ====");
        Integer integer = Integer.valueOf(10);
        Double doubleD = Double.valueOf(integer);

        System.out.println(integer + "\n" + doubleD);

    }
}

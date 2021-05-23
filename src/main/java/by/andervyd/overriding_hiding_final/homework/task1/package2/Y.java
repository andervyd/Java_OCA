package by.andervyd.overriding_hiding_final.homework.task1.package2;

import by.andervyd.overriding_hiding_final.homework.task1.package1.*;

public class Y extends X {

    public Y() {
    }

    @Override
    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {

        Y y = new Y();
        y.abc();
    }
}

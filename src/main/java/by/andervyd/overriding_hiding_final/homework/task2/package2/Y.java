package by.andervyd.overriding_hiding_final.homework.task2.package2;

import by.andervyd.overriding_hiding_final.homework.task1.package1.X;

public class Y extends X {

    @Override
    public void abc() {
        System.out.println("Y");
    }

    public void def() {
        Y y = new Y();
        y.abc();
    }

    public void ghi() {
        Y y = new Y();
        y.abc();
    }

    public static void main(String[] args) {

        Y y = new Y();

        y.abc();
        y.def();
        y.ghi();
    }
}

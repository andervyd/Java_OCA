package by.andervyd.overriding_hiding_final.homework.task4;

class X {
}

class Y extends X {
}

public class Test {

    public static void abc(X x, Y y) {
        System.out.println("Hi");
    }

    public static void abc(Y y, X x) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {

        Y a = new Y();
//        abc(a, a);
    }
}

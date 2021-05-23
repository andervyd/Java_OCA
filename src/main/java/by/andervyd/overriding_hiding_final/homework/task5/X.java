package by.andervyd.overriding_hiding_final.homework.task5;

public class X {
    String string = "Hi";
}

class Y extends X {
    boolean bool = false;
}

class Test {
    public static void main(String[] args) {

        X x = new Y();
//        System.out.println(x.string + " " + x.bool);
    }
}

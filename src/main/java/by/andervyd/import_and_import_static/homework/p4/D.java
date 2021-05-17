package by.andervyd.import_and_import_static.homework.p4;

import by.andervyd.import_and_import_static.homework.p1.A;
import by.andervyd.import_and_import_static.homework.p1.p2.p3.C;
import by.andervyd.import_and_import_static.homework.p4.p5.E;
import static by.andervyd.import_and_import_static.homework.p1.p2.B.b;
import static by.andervyd.import_and_import_static.homework.p1.p2.B.abc;

public class D {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("Var class 'A': " + a.a);
        a.abc();

        C c = new C();
        System.out.println("Var class 'C': " + c.c);
        c.abc();

        E e = new E();
        System.out.println("Var class 'E': " + e.e);
        e.abc();

        System.out.println("Var class 'B': " + b);
        abc();
    }
}

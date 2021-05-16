package by.andervyd.final_and_static.final_examp;

import java.lang.invoke.VarHandle;

public class Constanta {

    public final int NUM = 10;
// or
    public final int VAR;

    public Constanta() {
        VAR = 10;
        System.out.println("VAR: " + VAR);
    }

    public Constanta(boolean isCheck) {
        VAR = 15;
        System.out.println("VAR: " + VAR);
    }

    public void incResult(int number) {
        final int VAR;
        VAR = 12;
        System.out.println("Sum: " + (number + VAR));
    }

    public void returnConst(final double NUMBER) {
//        NUMBER = 12; // don't work
        System.out.println("Inner NUMBER: " + NUMBER);
    }
}

class CheckConstanta {
    public static void main(String[] args) {
        boolean isCheck = true;

        Constanta constantaOne = new Constanta();        // VAR = 10
        Constanta constantaTwo = new Constanta(isCheck); // VAR = 15

        final Constanta constantaTree = new Constanta(); // don't change address, but not fields in object

        System.out.println("NUM: " + constantaOne.NUM);
        System.out.println("NUM: " + constantaTwo.NUM);

        constantaOne.incResult(13);
        constantaTwo.returnConst(20);
    }
}

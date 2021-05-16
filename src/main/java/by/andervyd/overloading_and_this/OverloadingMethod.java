package by.andervyd.overloading_and_this;

public class OverloadingMethod {

    void showVar(int var) {
        System.out.println("int: " + var);
    }

    void showVar(boolean var) {
        System.out.println("boolean: " + var);
    }

    boolean showVar(int varOne, int varTwo) {
        return varOne >= varTwo;
    }

    void showVar(String var) {
        System.out.println("string: " + var);
    }

    void showVar(String sVar, int iVar) {
        System.out.println("string: " + sVar + ", int: " + iVar);
    }

    void showVar(int iVar, String sVar) {
        System.out.println("int: " + iVar + ", string: " + sVar);
    }
}

class OverloadingMethodTest {
    public static void main(String[] args) {
        int intTypeOne = 5;
        int intTypeTwo = 10;
        boolean booleanType = true;
        String stringType = "check";

        OverloadingMethod method = new OverloadingMethod();

        method.showVar(intTypeTwo);
        method.showVar(booleanType);
        method.showVar(intTypeOne, intTypeTwo);
        method.showVar(stringType);
        method.showVar(stringType, intTypeOne);
        method.showVar(intTypeOne, stringType);
    }
}

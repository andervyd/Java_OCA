package by.andervyd.final_and_static.static_examp;

public class StaticInMethod {
    int nonStaticField;
    static int staticField;

    public void nonStaticMethod() {
        nonStaticField = 5;

        staticField = 5;
    }

    public static void staticMethod() {  // ONLY static or create Object
//        nonStaticField = 5;
        StaticInMethod method = new StaticInMethod();
        method.nonStaticField = 5;

        staticField = 5;
    }
}

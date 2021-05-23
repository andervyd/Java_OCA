package by.andervyd.overriding_hiding_final;

public interface InterfaceT1 {

    void abc();

    default void def() {
        System.out.println("This is \"def()\"");
    }

    static void ghi() {
        System.out.println("This is \"ghi()\"");
    }
}

class ClassZ1 implements InterfaceT1 {

    @Override
    public void abc() {
        System.out.println("This is \"abc()\"");
    }

    public static void main(String[] args) {

        ClassZ1 classZ1 = new ClassZ1();

        classZ1.abc();
        classZ1.def();

        InterfaceT1.ghi();
    }
}



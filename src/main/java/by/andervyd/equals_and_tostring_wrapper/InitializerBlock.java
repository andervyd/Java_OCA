package by.andervyd.equals_and_tostring_wrapper;

public class InitializerBlock {

    public InitializerBlock() {
        System.out.println("Constructor");
    }

    { // work when creating object (non-static)
        System.out.println("Non-static initializer block");
    }

    static { // work when loading in memory (static)
        System.out.println("Static initializer block");
    }

    public static void main(String[] args) {

        InitializerBlock block = new InitializerBlock();
    }
}

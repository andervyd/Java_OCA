package by.andervyd.encapsulation_and_super_protected;

public class SuperConstructor {
    String name;
    int version;

    SuperConstructor() {
        // default constructor
    }
}

class Child extends SuperConstructor {

    Child() {
        super(); // default constructor SuperConstructor()
    }

    public static void main(String[] args) {

        Child child = new Child();
    }
}

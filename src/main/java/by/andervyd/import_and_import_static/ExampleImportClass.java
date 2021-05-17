package by.andervyd.import_and_import_static;

import by.andervyd.class_and_object.*;
import by.andervyd.constuctor_and_method.Car;
import by.andervyd.import_and_import_static.packone.ClassOne;

public class ExampleImportClass {
    public static void main(String[] args) {

        by.andervyd.constuctor_and_method.Car carOne =
                new by.andervyd.constuctor_and_method.Car();
        // or
        Car carTwo = new Car();

        BankAccount bankAccount = new BankAccount();

        // One name different classes:
        ClassOne classOneOne = new ClassOne();
        by.andervyd.import_and_import_static.packtwo.ClassOne classOneTwo =
                new by.andervyd.import_and_import_static.packtwo.ClassOne();
    }
}

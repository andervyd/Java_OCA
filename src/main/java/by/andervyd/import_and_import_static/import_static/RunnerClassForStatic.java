package by.andervyd.import_and_import_static.import_static;

import static by.andervyd.import_and_import_static.packone.ClassOne.var;
import static by.andervyd.import_and_import_static.packone.ClassOne.printInfo;

public class RunnerClassForStatic {
    public static void main(String[] args) {

        int intTemp = var;
        String textTemp = printInfo();

        System.out.println("Output var: " + intTemp);
        System.out.println("Output method: " + textTemp);
    }
}

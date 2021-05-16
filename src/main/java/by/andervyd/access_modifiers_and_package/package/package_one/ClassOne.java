package by.andervyd.access_modifiers_and_package.package_one;

import by.andervyd.access_modifiers_and_package.package_two.ClassTwo;
import by.andervyd.access_modifiers_and_package.package_two.inner_package_one.InnerClassOne;

public class ClassOne {
    public static void main(String[] args) {

        InnerClassOne innerClassOne = new InnerClassOne();
        ClassTwo classTwo = new ClassTwo();

        by.andervyd.access_modifiers_and_package.package_two.inner_package_two.InnerClassTwo innerClassTwo =
                new by.andervyd.access_modifiers_and_package.package_two.inner_package_two.InnerClassTwo();
    }
}

package by.andervyd.final_and_static.homework.task2;

public class CalculatingArea {
    public static final double PI = 3.14;

    public double circleArea(double radius) {
        return Math.ceil(PI * radius * radius);
    }

    public static double circumference(double radius) {
        return Math.ceil(2 * PI * radius);
    }

    public void showInfo(double radius) {
        System.out.println("Radius: " + radius);
        System.out.println("Circle area: " + circleArea(radius));
        System.out.println("Circumference: " + CalculatingArea.circumference(radius));
    }
}

class CalculatorRunner {
    public static void main(String[] args) {

        CalculatingArea area = new CalculatingArea();

        System.out.println("Circle area: " + area.circleArea(32.4));
        System.out.println("------------------");
        System.out.println("Circumference: " + CalculatingArea.circumference(4.8));
        System.out.println("------------------");
        area.showInfo(42.3);
    }
}

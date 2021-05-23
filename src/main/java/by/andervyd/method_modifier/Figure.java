package by.andervyd.method_modifier;

abstract public class Figure {

    abstract public void perimeter();

    abstract public void area();

    public void showInfo() {
        System.out.println("This is figure");
    }
}

class Circle extends Figure {
    double radius = 3;

    @Override
    public void perimeter() {
        System.out.println("Perimeter circle: " + (2 * Math.PI * radius));
    }

    @Override
    public void area() {
        System.out.println("Perimeter square: " + (Math.PI * radius * radius));
    }
}

class Square extends Figure {
    double side = 10;

    @Override
    public void perimeter() {
        System.out.println("Perimeter square: " + (4 * side));
    }

    @Override
    public void area() {
        System.out.println("Perimeter square: " + (side * side));
    }
}

abstract class Shape extends Figure {

    public void show() {
        System.out.println("This is shape");
    }
}
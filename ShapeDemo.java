abstract class Shape {
    int dim1, dim2;

    Shape(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2));
    }
}

class Circle extends Shape {
    Circle(int r, int d) {
        super(r, d);
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * dim1 * dim1));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);
        Circle c = new Circle(5, 0);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
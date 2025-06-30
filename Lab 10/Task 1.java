public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();
        s2.area();
    }
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

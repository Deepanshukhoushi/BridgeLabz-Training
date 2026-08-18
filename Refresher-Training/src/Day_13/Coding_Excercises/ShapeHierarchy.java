package Day_13.Coding_Excercises;

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}


public class ShapeHierarchy {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 7)
        };

        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
        }
    }
}

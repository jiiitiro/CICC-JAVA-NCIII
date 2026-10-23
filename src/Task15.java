import java.util.List;

public class Task15 {
    public static void main(String[] args) {
//         lambda version
        List<AbstractShape> shapes = List.of(
                new Circle("Red", 5),
                new Rectangle("Blue", 4, 6));

        shapes.forEach(s -> {
            System.out.println(s.getClass().getSimpleName() + " (" + s.color + ")");
            System.out.printf("Area: %.2f%n", s.calculateArea());
            System.out.printf("Perimeter: %.2f%n\n", s.calculatePerimeter());
        });
    }
}

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, radius * 2, radius * 2);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
}

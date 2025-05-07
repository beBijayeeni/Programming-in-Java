
abstract class Shape {
    double length, breadth, height;
    public abstract double volume();
    public abstract double surfaceArea();
}
class Cube extends Shape {
    public Cube(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }
    public double volume() {
        return Math.pow(length, 3);
    }
    public double surfaceArea() {
        return 6 * Math.pow(length, 2);
    }
}
class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        this.length = radius;
        this.breadth = radius;
        this.height = height;
    }
    public double volume() {
        return Math.PI * length * breadth * height;
    }
    public double surfaceArea() {
        return 2 * Math.PI * length * (height + length);
    }
}
class Cuboid extends Shape {
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public double volume() {
        return length * breadth * height;
    }
    public double surfaceArea() {
        return 2 * (length * breadth + breadth * height + length * height);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Cube(3),
            new Cylinder(2, 5),
            new Cuboid(2, 3, 4)
        };

        for (Shape s : shapes) {
            System.out.printf(
                "%s → Volume: %.2f, Surface Area: %.2f%n",
                s.getClass().getSimpleName(),
                s.volume(),
                s.surfaceArea()
            );
        }
    }
}

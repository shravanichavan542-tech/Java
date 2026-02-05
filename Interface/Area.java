// Interface Definition
interface Shape {
    double area();
    double perimeter();
    void display();
}

// Circle class implementing Shape
class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("\n--- Circle ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double len;
    double bred;

    public Rectangle(double len, double bred) {
        this.len = len;
        this.bred = bred;
    }

    public double area() {
        return len * bred;
    }

    public double perimeter() {
        return 2 * (len + bred);
    }

    public void display() {
        System.out.println("\n--- Rectangle ---");
        System.out.println("Length: " + len);
        System.out.println("Breadth: " + bred);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

// Main Class
public class Area {
    public static void main(String args[]) {
        Shape c = new Circle(12);
        Shape r = new Rectangle(8, 9);

        c.display();
        r.display();
    }
}

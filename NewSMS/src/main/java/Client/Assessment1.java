package Client;

abstract class shape {
    // Abstract method to calculate area
    abstract public double area(int a, int b);
}

class Triangle extends shape {
    @Override
    public double area(int base, int height) {
        return 0.5 * base * height;  // Formula for triangle area
    }
}

public class Assessment1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();  // Create an instance of Triangle
        double area = triangle.area(4, 80); // Call the method
        System.out.println("Area of a triangle is = " + area);
    }
}

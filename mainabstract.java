// Main class to demonstrate usage of the Shape hierarchy
package Bank;
public class mainabstract {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Shape circle = new Circle(5.0);  // Radius = 5
        Shape rectangle = new Rectangle(4.0, 6.0);  // Length = 4, Width = 6
        Shape triangle = new Triangle(3.0, 4.0, 5.0);  // Sides = 3, 4, 5

        // Display details and calculate area and perimeter for the circle
        System.out.println("Circle:");
        circle.displayDetails();
        System.out.println("Radius: " + ((Circle) circle).getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println();

        // Display details and calculate area and perimeter for the rectangle
        System.out.println("Rectangle:");
        rectangle.displayDetails();
        System.out.println("Length: " + ((Rectangle) rectangle).getLength());
        System.out.println("Width: " + ((Rectangle) rectangle).getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println();

        // Display details and calculate area and perimeter for the triangle
        System.out.println("Triangle:");
        triangle.displayDetails();
        System.out.println("Sides: " + ((Triangle) triangle).getSide1() + ", " + ((Triangle) triangle).getSide2() + ", " + ((Triangle) triangle).getSide3());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}

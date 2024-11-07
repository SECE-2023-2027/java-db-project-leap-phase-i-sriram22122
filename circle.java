// Concrete class representing a Circle
package Bank;
class Circle extends Shape {
    private double radius;  // private variable for radius

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the abstract method to calculate the area of a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override the abstract method to calculate the perimeter of a circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Additional method to get the radius of the circle
    public double getRadius() {
        return radius;
    }
}

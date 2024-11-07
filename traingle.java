// Concrete class representing a Triangle
package Bank;
class Triangle extends Shape {
    private double side1;  // private variable for side1
    private double side2;  // private variable for side2
    private double side3;  // private variable for side3

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the abstract method to calculate the area of a triangle
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    // Override the abstract method to calculate the perimeter of a triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Additional methods to get the sides of the triangle
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}

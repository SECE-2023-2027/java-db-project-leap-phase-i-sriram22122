// Concrete class representing a Rectangle
package Bank;
class Rectangle extends Shape {
    private double length;  // private variable for length
    private double width;   // private variable for width

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the abstract method to calculate the area of a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Override the abstract method to calculate the perimeter of a rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Additional methods to get the length and width of the rectangle
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

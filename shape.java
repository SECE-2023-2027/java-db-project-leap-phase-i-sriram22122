// Abstract class for shapes
package Bank;
abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();

    // Concrete method for displaying the shape details
    public void displayDetails() {
        System.out.println("Shape details:");
    }

    // Abstract method for calculating perimeter
    public abstract double calculatePerimeter();
}

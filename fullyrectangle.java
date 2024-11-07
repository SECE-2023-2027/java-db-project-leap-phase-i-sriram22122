package abstraction;

//Concrete class Rectangle implementing the Shape class
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementing the calculateArea method
 @Override
 public double calculateArea() {
     return length * width;
 }

 // Implementing the calculatePerimeter method
 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}

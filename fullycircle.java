package abstraction;

//Concrete class Circle implementing the Shape class
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementing the calculateArea method
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Implementing the calculatePerimeter method
 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

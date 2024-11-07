package abstraction;

//Main class to test the fully abstract class
public class mainfullabs {
 public static void main(String[] args) {
     Shape circle = new Circle(5.0);  // Circle with radius 5
     Shape rectangle = new Rectangle(4.0, 6.0);  // Rectangle with length 4 and width 6

     System.out.println("Circle Area: " + circle.calculateArea());
     System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
     System.out.println("Rectangle Area: " + rectangle.calculateArea());
     System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
 }
}

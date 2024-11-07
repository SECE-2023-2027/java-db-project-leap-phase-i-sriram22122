package methodoverriding;

//Animal class - the base class
class Animal {
 private String name;  // Private variable to store the animal's name

 // Constructor
 public Animal(String name) {
     this.name = name;
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Method to be overridden in child classes
 public void makeSound() {
     System.out.println("Animal is making a generic sound");
 }

 // Method that can be overridden to print unique behaviors
 public void sleep() {
     System.out.println(getName() + " is sleeping.");
 }
}

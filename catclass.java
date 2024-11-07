package methodoverriding;

//Cat class - derived from Animal
class Cat extends Animal {
 private boolean isIndoor; // Specific property for indoor/outdoor cat

 // Constructor
 public Cat(String name, boolean isIndoor) {
     super(name);  // Call parent class constructor
     this.isIndoor = isIndoor;
 }

 // Overriding the makeSound method
 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Meow! Meow!");
 }

 // Overriding the sleep method to demonstrate more specific behavior
 @Override
 public void sleep() {
     if (isIndoor) {
         System.out.println(getName() + " is napping on the couch.");
     } else {
         System.out.println(getName() + " is sleeping under a tree outside.");
     }
 }

 // Method specific to Cat class
 public void climb() {
     System.out.println(getName() + " is climbing a tree.");
 }
}

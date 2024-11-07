package methodoverriding;

//Dog class - derived from Animal
class Dog extends Animal {
 private String breed; // Additional private variable for breed

 // Constructor
 public Dog(String name, String breed) {
     super(name);  // Call parent class constructor
     this.breed = breed;
 }

 // Overriding the makeSound method
 @Override
 public void makeSound() {
     System.out.println(getName() + " says: Woof! Woof!");
 }

 // Overriding the sleep method to show more specific behavior
 @Override
 public void sleep() {
     System.out.println(getName() + " (a " + breed + ") is curled up in its bed, sleeping.");
 }

 // Method specific to Dog class
 public void fetch() {
     System.out.println(getName() + " is fetching the ball.");
 }
}


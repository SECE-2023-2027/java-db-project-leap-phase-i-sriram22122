// Mainjava.java
package Bank;
public class Mainjava {
    public static void main(String[] args) {
        // Create a Dogclass object
        Dogclass dog = new Dogclass("Buddy", "Golden Retriever");

        // Using getter methods to access private variables from Animalclass
        System.out.println("Dog's name is: " + dog.getName());  // From Animalclass
        System.out.println("Dog's breed is: " + dog.getBreed()); // From Dogclass

        // Using setter methods to modify private variables from Animalclass and Dogclass
        dog.setName("Max");  // From Animalclass
        dog.setBreed("Labrador"); // From Dogclass

        // Display updated information
        System.out.println("Updated Dog's name is: " + dog.getName()); // From Animalclass
        System.out.println("Updated Dog's breed is: " + dog.getBreed()); // From Dogclass

        // Call methods from both parent and child classes
        dog.makeSound();  // Inherited from Animalclass
        dog.display();    // Method in Dogclass
    }
}

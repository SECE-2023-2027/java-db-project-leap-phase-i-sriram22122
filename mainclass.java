package methodoverriding;
public class mainclass {
    public static void main(String[] args) {
        // Create objects of different animals
        Animal myDog = new Dog("Rex", "German Shepherd");
        Animal myCat = new Cat("Whiskers", true);

        // Call overridden methods
        System.out.println("\n--- Dog Behavior ---");
        myDog.makeSound();  // Calls Dog's makeSound
        myDog.sleep();      // Calls Dog's sleep

        // Demonstrating unique behavior of Dog class
        Dog dog = (Dog) myDog;  // Casting Animal back to Dog
        dog.fetch();            // Calling Dog-specific method

        System.out.println("\n--- Cat Behavior ---");
        myCat.makeSound();  // Calls Cat's makeSound
        myCat.sleep();      // Calls Cat's sleep
     
        // Demonstrating unique behavior of Cat class
        Cat cat = (Cat) myCat;  // Casting Animal back to Cat
        cat.climb();            // Calling Cat-specific method

        // Demonstrating dynamic method dispatch
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.makeSound();  // Calls Animal's makeSound
        genericAnimal.sleep();      // Calls Animal's sleep
    }
}

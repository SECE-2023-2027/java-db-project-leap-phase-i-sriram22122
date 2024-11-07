package Bank;

// Base class with constructor and 'this' keyword
class Animal {
    String name;

    // Constructor for Animal class
    public Animal(String name) {
        this.name = name; // 'this' refers to the current object
        System.out.println("Animal Constructor: " + name);
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

// Single Inheritance with 'super' keyword
class Dog extends Animal {
    String breed;

    // Constructor for Dog class, calling Animal constructor using 'super'
    public Dog(String name, String breed) {
        super(name);  // Calling parent class constructor
        this.breed = breed;  // 'this' refers to current class instance
        System.out.println("Dog Constructor: " + breed);
    }

    // Dog-specific method
    public void display() {
        System.out.println("Dog is a domestic animal. Breed: " + breed);
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    int age;

    // Constructor for Puppy class, calling Dog constructor
    public Puppy(String name, String breed, int age) {
        super(name, breed);  // Calling Dog constructor, which calls Animal constructor
        this.age = age;
        System.out.println("Puppy Constructor: Age " + age);
    }

    // Puppy-specific method
    public void play() {
        System.out.println("Puppy loves to play.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    // Constructor for Cat class, calling Animal constructor
    public Cat(String name) {
        super(name);  // Calling parent class constructor
    }

    public void display() {
        System.out.println(name + " is a cat, a domestic animal.");
    }
}

// Interface for Multiple Inheritance example
interface AnimalBehavior {
    void makeSound();
}

interface PetBehavior {
    void display();
}

// Multiple Inheritance using interfaces and constructor
class DogBehavior implements AnimalBehavior, PetBehavior {
    String name;

    // Constructor for DogBehavior
    public DogBehavior(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }

    @Override
    public void display() {
        System.out.println(name + " is a pet animal.");
    }
}

public class Bankclass {
    public static void main(String[] args) {

        // Single Inheritance Example
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.makeSound();  // Inherited from Animal
        dog.display();    // Method in Dog class

        System.out.println();  // For better separation between examples

        // Multilevel Inheritance Example
        Puppy puppy = new Puppy("Charlie", "Labrador", 1);
        puppy.makeSound();  // Inherited from Animal
        puppy.display();    // Inherited from Dog
        puppy.play();       // Method in Puppy class

        System.out.println();  // For better separation between examples

        // Hierarchical Inheritance Example (Cat inherits from Animal)
        Cat cat = new Cat("Whiskers");
        cat.makeSound();  // Inherited from Animal
        cat.display();    // Method in Cat class

        System.out.println();  // For better separation between examples

        // Multiple Inheritance Example (Using Interfaces)
        DogBehavior dogBehavior = new DogBehavior("Max");
        dogBehavior.makeSound();  // Implemented in DogBehavior class (from AnimalBehavior interface)
        dogBehavior.display();    // Implemented in DogBehavior class (from PetBehavior interface)
    }
}

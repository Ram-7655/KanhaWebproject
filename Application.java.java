#Application.java
// File: Animal.java

// A class with protected access specifier
public class Animal {

    // Protected field
    protected String species = "Unknown"; // Initialize with a default value

    // Protected method
    protected void makeSound() {
        System.out.println("Some generic animal sound");
#feature201 changes by vivek on october2024 for services module
// File: Dog.java

// Another class in the same package
public class Dog {
    Animal myAnimal = new Animal();

    void displayInfo() {
        // Accessing the default (package-private) field and method
        System.out.println("Species: " + myAnimal.species);
        myAnimal.makeSound();
    }

}
#end of feature201 code

    }
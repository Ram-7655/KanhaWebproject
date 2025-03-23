#Application.java
// File: Animal.java

// A class with protected access specifier
public class Animal {

    // Protected field
    protected String species = "Unknown"; // Initialize with a default value

    // Protected method
    protected void makeSound() {
        System.out.println("Some generic animal sound");
#feature202 by ethan in october2024 on reports module
public class Dog {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize the instance variables
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method to bark
    public void bark() {
        System.out.println(name + " says Woof!");
    }
#end of feature202 code
    }
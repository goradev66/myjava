package Inheritance;

//  Write a program to create a class called animal with a method called MakeSound().
// create a subclass called cat that override the makesound(). method to bark.

class Animal {
    public void MakeSound() {
        System.out.println("The animla makes a sound");
    }
}

class Cat extends Animal {
    public void MakeSound() {
        System.out.println("The cat quarrels");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.MakeSound();
        cat.MakeSound();
    }
}

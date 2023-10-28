package Poly;

// Write a program to create a  base class Animal (Animal family) with a method called sound().
// create two subclasses bird and cat override to make a specific sound for each animal.
class Animal {
    public void makesound() {
        System.out.println("the animal makes sound");
    }
}

class Birds extends Animal {
    public void MakeSound() {
        System.out.println("The birds chirps");
    }
}

class Cat extends Animal {
    public void MakeSound() {
        System.out.println("The cat meows");
    }
}

public class Pets {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Birds birds = new Birds();
        Cat cat = new Cat();

        animal.makesound();
        birds.MakeSound();
        cat.MakeSound();
    }
}

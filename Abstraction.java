
package Abstraction;

// Write a java program to create an abstract class Employee with abstract methods calculate 
// salary() and displayInfo() create subclass manager and programer that extends the employee
// class and implement the respective methods to calculate salary and display information for each role.  

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;

    }

    public abstract void Makesound();

    public String getname() {
        return name;

    }

}

class Cat extends Abstract {
    public Cat(String name) {
        super(name);

    }

    public void Makesound() {
        System.out.println(getname() + "Meows");
    }
}

class Dog extends Abstract {
    public Dog(String name) {
        super(name);
    }

    public void Makesound() {
        System.out.println(getname() + "Barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Abstract Dog = new Dog("buddy");
        Abstract Cat = new Cat("moti");

        Dog.Makesound();
        Cat.Makesound();

    }
}
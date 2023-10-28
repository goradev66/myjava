package Inheritance;

// Write a java program to create a class vehicle with a method called drive() 
// Create a subclass called car that override the drive() mehtod to print "Reaparing car"

class Vehicle {
    public void drive() {
        System.out.println("Reparing a vehicle");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Reparing a car");
    }
}

public class Reparing {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.drive();
        car.drive();
    }
}

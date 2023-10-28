package Abstraction;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;

    }

    public abstract void Makesound();

    public String getName() {
        return name;

    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void Makesound() {
        System.out.println(getName() + "Barks");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);

    }

    public void Makesound() {
        System.out.println(getName() + "Meows");
    }
}

abstract class Abstract {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal MyCat = new Cat("Fuffy");

        myDog.Makesound();
        MyCat.Makesound();

    }
}

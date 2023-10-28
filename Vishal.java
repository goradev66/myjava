package Encapsulation;

// Write a program to create a class called person with private instances variables name, age, and country
// provide public getter and setter methods to access and modify these variables. 

class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public class Vishal {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Vishal Gorade");
        person.setAge(22);
        person.setCountry("India");

        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Country" + country);
    }

}

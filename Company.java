package Abstraction;

abstract class Employee {
    protected String name;
    protected double basesalary;

    public Employee(String name, double basesalary) {
        this.name = name;
        this.basesalary = basesalary;
    }

    public abstract double calculatedsalary();

    public abstract void displayInfo();

    class Manager extends Employee {
        private double bonus;

        public Manager(String name, double basesalary, double bonus) {
            super(name, basesalary);
            this.bonus = bonus;
        }

        public double calculatedsalary() {
            return basesalary + bonus;
        }

        public void displayInfo() {
            System.out.println("Manager Name :" + name);
            System.out.println("Basesalary:  $" + basesalary);
            System.out.println("Bonus : $" + bonus);
            System.out.println("Total salary :$ " + calculatedsalary());
        }
    }

    class Programer extends Employee {
        private int overtimehours;
        private double hourlyrate;

        public Programer(String name, double basesalary, int overtimehours, double hourlyrate) {
            super(name, basesalary);
            this.overtimehours = overtimehours;
            this.hourlyrate = hourlyrate;

        }

        public double calculatedsalary() {
            return basesalary + (overtimehours * hourlyrate);

        }

        public void displayInfo() {
            System.out.println("Programmer Name :" + name);
            System.out.println("Basesalary : $" + basesalary);
            System.out.println("Overtime hours:" + overtimehours);
            System.out.println("Hourlyrate :$" + hourlyrate);
            System.out.println("Total salary :$" + calculatedsalary());
        }
    }

    public class Company {
        public static void main(String[] args) {
            Employee manager = new Manager("Corona cadogan", 6000, 10000);
            Employee programmer = new Programer("Antal nuka", 50000, 20, 25.0);

            manager.displayInfo();
            System.out.println("-------");
            programmer.displayInfo();
        }
    }
}

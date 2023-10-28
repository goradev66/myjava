package Abstraction;

//Write a program to create an abstract class GeometricShape with abstract method area()
// and perimeter(). create subclass triangle and square that extends the geometricShape class
// and implement the respective methods to calculate the area and perimeter of each shap. 

abstract class GeometricShape {
    public abstract double area();

    public abstract double perimeter();

}

class Triangle extends GeometricShape {
    private double Side1;
    private double Side2;
    private double Side3;

    public Triangle(double Side1, double Side2, double Side3) {
        this.Side1 = Side1;
        this.Side2 = Side2;
        this.Side3 = Side3;
    }

    public double area() {
        double s = (Side1 + Side2 + Side3) / 2;
        return Math.sqrt(s * (s - Side1) * (s - Side2) * (s - Side3));

    }

    public double perimeter() {
        return Side1 + Side2 + Side3;

    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double Side) {
        this.side = Side;
    }

   public double area()
   {
     this.side*side;

   }

    public double perimeter() {
        return 4 * side;
    }
}

public class Math {
    public static void main(String[] args) {
        GeometricShape Triangle = new Triangle(4, 5, 6);
        GeometricShape Square = new Square(6);

        System.out.println("Triangle area :" + Triangle.area());
        System.out.println("Triangle perimeter :" + Triangle.perimeter());
        System.out.println("Square area :" + Square.area());
        System.out.println("Square perimeter :" + Square.perimeter());
    }
}

/*
    ABSTRACTION:

    You don't implementation initially during designing a base class
    Ex: Shapes examples, getArea()

    Make methods abstract - I don't know the implemenatation of these methods in the base class, but dervied class
    will implement it, and if you want to create an object of the derived class then it must implement the abstract methods.

    Achieved by,

    1. Abstract classes - you can have normal as well as abstract methods
    2. Interfaces - everything is abstract by default

    ABSTRACT CLASSES:

    1. No instances
    2. References can be there
    3. Can have constructor
    4. A class can be abstract without any abstract method
    5. We can have static methods
    6. If a class has atleast one abstract method the class must be made abstract
    7. If a subclass doesn't implement all the abstract methods, then the derived must also be made abstract

    When to use Abstract classes

    1. When we have logical is a relationship like shape and rectangle, employee and salesEmployee
    2. When we need protected, private or default methods
    3. When we need non-static and non-final data members
*/


abstract class Shape {
    int color;
    int getColor() {
        return color;
    }
    Shape(int c) {
        color = c;
    }
    abstract double getArea();
}

class Square extends Shape {
    double side;
    Square(int c, double s) {
        super(c);
        side = s;
    }
    double getArea(){
        return side * side;
    }
}

class Circle extends Shape {
    int radius;
    Circle(int c, int r) {
        super(c);
        radius = r;
    }
    double getArea() {
        return 3.14 * radius * radius;
    } 
}
class Abstraction {
    public static void main (String []args) {
        // Shape sh = new Shape(1); ERROR !!
        Shape sh = new Square(2,5.25); // Allowed
        Square s = new Square(2,10.0);
        Circle c = new Circle(2,10);
        System.out.println(sh.getArea());
        System.out.println(s.getArea());
        System.out.println(c.getArea());        
    }
}   
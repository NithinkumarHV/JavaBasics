/*
    INTERFACES:

    implements - one should implement all the abstract methods of interface

    1. All members are public
    2. All data members are public static final
    3. All methods are abstract by default
    4. We can also have default(with implementation) and static methods
    5. A class can implement more than one interfaces
    6. An interface can extend more than one interfaces

    Ex: of interfaces in java library
        Comparable
        Clonable
        Runnable

    When to use Interfaces

    1. When we need a functionality to be implemented by possibly un-related classes
    2. Multiple implementations
    3. Multiple inheritance


    SIMILARITY BETWEEN ABSTRACT CLASSES AND INTERFACES
        used to achieve abstraction
        Instance cannot be created
        References can be created

    DIFF BETWEEN ABSTRACT CLASSES AND INTERFACES
        Interfaces can't have constructors
        All data members are public static final in interfaces
        All methods are public in interfaces
        implementations and multiple inheritance

    An abstract class can implement an inteface
    A normal class can extend an abstract class and can implement one or more intefaces
*/

interface Printable {
    // abstract by default
    default void fun() {
        System.out.println("Default method");
    }
    static void fun1() {
        System.out.println("Static method");
    }
    void print();
}

class MyClass implements Printable {
    public void print() {
        System.out.println("My Class");
    }
}

class Interfaces {
    public static void main (String []args) {
        MyClass m = new MyClass();
        m.print();
        m.fun();
        // m.fun1();    ERROR !!  should use interface name while calling static methods
        Printable.fun1();
    }
}
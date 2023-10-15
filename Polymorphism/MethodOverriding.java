/*
    METHOD OVERRIDING: RUN-TIME Polymorphism

    In Java, no need to use keyword like virtual(as in C++), it has by default run time Polymorphism

    1. A base class reference can refer to derived class object, but reverse is not allowed
    2. Overriding works with multilevel inheritance
    3. Static methods are not overriden
    4. we can call Base's fun using super

    class Base {

    }
    class derived extends Base {

    }
    public class Test {
        public static void main(String []args) {
            Base b = new Derived();
        }
    }

    APPLICATIONS:

    Raise salary example in Employee mgmt system
*/

class Base {
    void fun(){
        System.out.println("Base's Fun");
    }
    static void fun1() {
        System.out.println("Base's Fun");
    }
    void fun2() {
        System.out.println("Base's Fun");
    }
}
class Derived extends Base {
    void fun() {
        System.out.println("Derived's fun");
    }
    static void fun1() {
        System.out.println("Derived's fun");
    }
    void fun2() {
        super.fun2();
        System.out.println("Derived's fun");
    }
}
class Grandchild extends Derived {
    void fun() {
        System.out.println("Grandchild's fun");
    }
}
public class MethodOverriding {
    public static void main(String []args) {
        Base b = new Derived();
        Base a = new Grandchild();
        b.fun(); // Derived's fun
        a.fun(); // Grandchild's fun
        b.fun1(); // Base's Fun
        b.fun2(); 
        /* Base's Fun
           Derived's fun
        */
    }
}
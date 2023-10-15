/*
    INHERITANCE:

    Implements a relationship
    Code Reusability
    Used in method overriding
    Used in abstract classes and interfaces

    Every class in java which is not inheriting from anything else is inheriting from object class
    OBJECT CLASS - root of inheritance hierarchy

    Methods of OBJECT CLASS
    clone()
    equals()
    hashCode()
    toStrung()
*/

class Employee {
    int id;
    int salary;

    Employee(int i,int s){
        id = i;
        salary = s;
    }
}

class SalesEmployee extends Employee {
    int salesIncentive;
    SalesEmployee(int i, int s, int si) {
        super(i,s); // used to access parent class members, here using super we have called constructor of the parent class
        salesIncentive = si;
    }
}

class Inheritance {
    public static void main(String []args){
        SalesEmployee s1 = new SalesEmployee(1, 1000000, 100000);
        System.out.println(s1.id + ": " + s1.salary);
        System.out.println(s1.salesIncentive);
    }
}
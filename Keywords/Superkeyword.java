/*
    SUPER KEYWORD:

    1. To call parent class's constructor
    2. To access data members and methods of the parent class
    3. To avoid name conflicts
        Arises when we have same data member name in the parent and child classes
        then we can use super.memberName
*/

class Base {
    int x;
    int z;
    Base() {
        x = 0;
    }
    Base(int i){
        x = i;
    }
}

class Derived extends Base {
    int y;
    int z = 20;

    Derived(){
        super();
        y=0;
    }
    Derived(int i,int j){
        super(i);
        y=j;
    }

    // To avoid name conflicts
    void print() {
        System.out.println(super.z);
        System.out.println(z);
    }
}
// If we remove super() and super(i) - OUTPUT (0, 10)
// Bcz by default non parametrised constructor of parent class is called

class Superkeyword {
    public static void main(String []args){
        Derived d = new Derived(10,10);
        System.out.println(d.x + " " + d.y);
        d.print();
    }
}
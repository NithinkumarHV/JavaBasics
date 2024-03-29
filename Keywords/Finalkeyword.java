import java.io.*;

class Test {
    // Instance Final Variable - are at instance level i.e, every object has a different copy of x and y
    final int x,y;
    // Initializer block
    { x = 100; };
    // Initialise using constructor
    Test() {
        y=1;
    }
}

// static or class variables - at class level, like global const variables
class Test1 {
    static final int MAX = 100;
}

class Finalkeyword {
    // Static Final or Class Final variable
    static final int MIN = 0;

    public static void main(String []args){
        // Local Final variable
        final StringBuffer sb = new StringBuffer("Geeks");
        sb.append("forGeeks");

        // sb = new StringBuffer("GeeksforGeeks"); error: cannot assign a value to final variable sb

        Test t = new Test();
        System.out.println(t.x + " " + t.y);

        Test1 t1 = new Test1();
        System.out.println(t1.MAX);

        // Can be used without even creating an object
        System.out.println(MIN);

        // Final reference variable
        System.out.println(sb);

    }
}
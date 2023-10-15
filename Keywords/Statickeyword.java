class Player {
    String name;
    int id;
    static int count = 0;

    // constructor
    Player(String name) {
        this.name = name;
        id = ++count;
    }

    void printDetails() {
        System.out.println(id + ": " + name);
    }
}

class Test {
    int a,b;
    void print() {
        System.out.println(a + ":" + b);
    }
}

public class Statickeyword {
    public static void main (String []args) {
        Player p1 = new Player("xyz");
        Player p2 = new Player("wxy");
        Test t = new Test();


        p1.printDetails();
        p2.printDetails();

        // When no constructor is written then compiler creates constructor and initializes variables to default value
        t.print();
        System.out.println(Player.count + "=" + p1.count);
    }
}
class A {
    private int x;
    int getx() {
        return x;
    }
}

public class Access {
    public static void main(String []args) {
        A t = new A();
        // System.out.println(t.x);  error: x has private access in A
        System.out.println(t.getx());
    }
}
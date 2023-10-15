class MultiThreadingInterfaceTest implements Runnable {
    public void run (){
        System.out.println("In test thread");
    }
}

public class MultiThreadingInterface {
    public static void main (String []args) {
        Thread t = new Thread(new MultiThreadingInterfaceTest());
        // Another thread starts
        t.start();
        System.out.println("In main thread");
    }
}
import java.math.BigInteger;
import java.util.*;

class Fibonacci {
    public static BigInteger fib(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);

        System.out.print(a + " ");
        System.out.print(b);


        for(int i=2; i<=n; i++) {
            c = a.add(b);
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        return b;
    }

    public static void main (String []args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = s.nextInt();
        System.out.println("\nFibonacci " + n + "th term " + fib(n));
    }
}
/*
    BigInteger Class:

    No limit for big integer, it depends on the memory available in the system
    If there is memory, any size number can be stored

    BigInteger A = new BigInteger("54");
    int b = 123;
    BigInteger B = new BigInteger.valueof(b);

    BigInteger C = A.add(B);
                   A.multiply(B);
                   A.remainder(B);

    A.compareTo(B)
        > 0 => A > B
        < 0 => B > A
        = 0 => A = B

    BigInteger A = new BigInteger("100");
    int a = A.intValue();
    long b = A.longValue();
    String z = A.toString();
 */

import java.math.BigInteger;
import java.util.*;

public class BigIntegerFactorial {
    public static BigInteger factorial(int a) {
    BigInteger f = new BigInteger("1");
    for (int i=2; i<=a; i++) {
        BigInteger x = BigInteger.valueOf(i);
        f=f.multiply(x);
    }
    return f;
}
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = s.nextInt();
        System.out.println("Factorial of " + a + " is " + factorial(a));
    }
}
/*
 * Problem name : Java Primality Test
 */
package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        if (n.isProbablePrime(50)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
        
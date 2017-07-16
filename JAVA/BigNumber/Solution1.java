/*
 * Problem name : Java BigInteger
 */
package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}

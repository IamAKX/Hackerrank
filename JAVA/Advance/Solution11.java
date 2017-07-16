/*
 * Problem name : Java MD5
 */
package Advance;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution11 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {
        }
    }
}

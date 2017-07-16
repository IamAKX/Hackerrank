/*
 * Problem name : Java Datatypes
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String num = sc.next();
            long n = 0;
            T--;
            try {
                n = Long.parseLong(num);
            } catch (Exception e) {
                System.out.println(num + " can't be fitted anywhere.");
                continue;
            }
            if (n==(byte)n) {
                System.out.println(n + " can be fitted in:\n"
                        + "* byte\n"
                        + "* short\n"
                        + "* int\n"
                        + "* long");
            } else if (n==(short)n) {
                System.out.println(n + " can be fitted in:\n"
                        + "* short\n"
                        + "* int\n"
                        + "* long");
            } else if (n==(int)n) {
                System.out.println(n + " can be fitted in:\n"
                        + "* int\n"
                        + "* long");
            } else if (n==(long)n) {
                System.out.println(n + " can be fitted in:\n"
                        + "* long");
            }

        }
    }
}

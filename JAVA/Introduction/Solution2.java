/*
 * Problem name : Java If-Else
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2 != 0)
            System.out.print("Weird");
        else
        {
            if((n>=2 && n<=5) || (n>20))
                System.out.print("Not Weird");
            else
                System.out.print("Weird");
        }
    }
}

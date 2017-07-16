/*
 * Problem name : Java Loops II 
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int i;
        while(q>0)
        {
            q--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a+b;
            System.out.print(sum +" ");
            for(i=1;i<n;i++)
            {
                sum += (int)(Math.pow(2, i))*b;
                System.out.print(sum +" ");
            }
            System.out.println();
        }
    }
}

/*
 * Problem name : Palindrome
 */
package String;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        checkPalindrome(A.toLowerCase());
    }

    private static void checkPalindrome(String A) {
        for(int i = 0, j = A.length()-1;i<A.length()/2;i++,j--)
        {
            if(A.charAt(i)!=A.charAt(j))
            {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}

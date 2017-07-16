/*
 * Program name : Java Anagrams 
 */
package String;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution5 {
     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a.toUpperCase(), b.toUpperCase());
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
     
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        char[] arrA = a.toUpperCase().toCharArray();
       char[] arrB = b.toUpperCase().toCharArray();
       Arrays.sort(arrA);
       Arrays.sort(arrB);
       
       for(int i = 0; i < a.length(); i++)
           try {
               if(Character.toUpperCase(arrA[i]) != Character.toUpperCase(arrB[i])) return false;
           } // end try
           catch(Exception e) {
               return false;
           } // end catch
       return true;
    }
}

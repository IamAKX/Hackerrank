/*
 * Problem name : Java Substring Comparisons 
 */
package String;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution3 {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int i,l = s.length();
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        
         for (i = 1; i < s.length()-k+1; i++) {
            String sub = s.substring(i,i+k);
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
       
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
 * Problem name : Java Bitset
 */
package DataStructure;

import java.util.BitSet;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution14 {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet[] array = {new BitSet(N),new BitSet(N)};
        
        
        while(M-- > 0)
        {
            String command = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            switch(command)
            {
                case "AND":
                    array[x-1].and(array[y-1]);
                    break;
                    
                case "OR":
                    array[x-1].or(array[y-1]);
                    break;

                case "XOR":
                    array[x-1].xor(array[y-1]);
                    break;

                case "FLIP":
                    array[x-1].flip(y);
                    break;

                case "SET":
                    array[x-1].set(y);
                    break;
            }
            System.out.println(array[0].cardinality() + " " + array[1].cardinality());
 
        }
    }

  
}

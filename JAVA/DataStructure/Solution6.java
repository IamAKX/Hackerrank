/*
 * Problem name : Java List
 */
package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while(n-- > 0)
            list.add(sc.nextInt());
        
        n = sc.nextInt();
        while(n-- > 0)
        {
            String q = sc.next();
            switch(q)
            {
                case "Insert": 
                    int pos  = sc.nextInt();
                    int value = sc.nextInt();
                    list.add(pos, value);
                    break;
                case "Delete":
                    pos = sc.nextInt();
                    list.remove(pos);
                    break;
                
            }
        }
        
        for(int x:list)
            System.out.print(x+" ");
        
    }
}

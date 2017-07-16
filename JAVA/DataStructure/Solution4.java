/*
 * Problem name :Java Arraylist 
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution4 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
       ArrayList<ArrayList<String>> arraylistArray = new ArrayList<ArrayList<String>>(N);
       for(int i = 0;i<N;i++)
       {
        
            String[] l = sc.nextLine().split(" ");
            arraylistArray.add(new ArrayList<String>(Arrays.asList(l)));
       }
        
       int M = sc.nextInt();
       for(int i = 0;i<M;i++)
       {
           int row = sc.nextInt()-1;
           int col = sc.nextInt();
           try{
               System.out.println(arraylistArray.get(row).get(col));
           }catch(Exception e)
           {
               System.out.println("ERROR!");
           }
       }
    }
}

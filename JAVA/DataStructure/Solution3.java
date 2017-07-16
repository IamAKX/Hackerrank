/*
 * Problem name : Java SUbarray
 */
package DataStructure;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        
        int ar[] = new int[N];
        int subarraySize = 1;
        int negativeSumCounter = 0;
        int sum = 0;
        
        for(int i=0;i<N;i++)
            ar[i] = sc.nextInt();
        
        while(subarraySize<=N)
        {
            for(int i=0;i+subarraySize<=N;i++)
            {
                sum=0;
                for(int j=i;j<i+subarraySize;j++)
                {
                    sum += ar[j];
                }
               
                if(sum < 0)
                    negativeSumCounter++;
                
            }
            subarraySize++;
        }
        
        System.out.println(negativeSumCounter);
    }
}

/*
 * Problem name : Java BigDecimal 
 */
package BigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution3 {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        for(int i = 0;i<n-1; i++ )
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j+1]))<1)
                {
                    String t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
            }
        }

    
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

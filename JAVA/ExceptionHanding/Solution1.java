/*
 * Problem name  : Java Exception Handling (Try-catch)

 */
package ExceptionHanding;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch(Exception e)
        {
            String s = e.toString();
            if(s.contains("java.util.InputMismatchException"))
                System.out.println("java.util.InputMismatchException");
            else
                System.out.println(e.fillInStackTrace());
        }
    }
}

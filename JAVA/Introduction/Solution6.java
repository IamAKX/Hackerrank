/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution6 {
    public static void main(String[] args) {
        int i;
        
        Scanner sc = new Scanner(System.in);
        for(i =0;;i++)
        {
            String s = sc.nextLine();
            if(s!=null)
                System.out.println((i+1)+ " " + s);
            else
                break;
        }
    }
}

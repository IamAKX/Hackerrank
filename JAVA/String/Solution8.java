/*
 * Problem name  : Java Regex 
 */
package String;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution8 {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    private static class MyRegex {

        private String pattern =  "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";

        
    }
}

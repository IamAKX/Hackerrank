/*
 * Problem name : Currency format
 */
package Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nf.format(payment));

       System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment));
       
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
         
    }
}

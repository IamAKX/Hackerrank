/*
 * Problem name : Java Exception Handling 
 */
package ExceptionHanding;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static class MyCalculator {

        private String power(int n, int p) {
            try {
                if (n < 0 || p < 0) {
                    throw new NegativeNumberException("java.lang.Exception: n and p should be non-negative");
                } else {
                    return String.valueOf((int)(Math.pow(n, p)));
                }
            } catch (NegativeNumberException ex) {
                return ex.toString();
            }
        }
    }

    private static class NegativeNumberException extends Exception {

        String exception;

        public NegativeNumberException(String exeception) {
            this.exception = exeception;
        }

        public String toString() {
            return exception;
        }
    }
}

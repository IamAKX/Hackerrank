/*
 * Problem name : Java Abstract Class 
 */
package ObjectOrientedProgramming;

import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution3 {

    public static void main(String[] args) {
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }

    public static class MyBook extends Book {

        public void setTitle(String s) {
            super.title = s;
        }
    }

    abstract class Book {

        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }
}

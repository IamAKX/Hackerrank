/*
 * Problem name : Java Inheritance I
 */
package ObjectOrientedProgramming;

/**
 *
 * @author akash
 */
public class Solution1 {

    public static void main(String args[]) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }

    public static class Animal {

        void walk() {
            System.out.println("I am walking");
        }
    }

    public static class Bird extends Animal {

        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }

}

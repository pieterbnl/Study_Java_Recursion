package com.pbe;

/** Study on Recurssion
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */


// *********************
// RECURSION
// *********************
// Recursion is the process of defining something in terms of itself.
// It's the attribute that allows a method to call itself. This method is said to be 'recursive'.
// Recursive methods can be used to create clearer and simpler versions of several algorithms than iterative versions.
// Recursive methods need an if statement somewhere to force the method to return without the recursive call being executed, or it won't stop.
public class Main {

    public static void main(String[] args) {

        // Simple example
        System.out.println("Simple example, callMyself");
        callMyself(5);
        System.out.println();

        // Summing numbers
        System.out.println("Summing numbers");
        int sumOfAllNumbers = sumOfAllNumbers(5);
        System.out.println("The sum of i = " + sumOfAllNumbers);
        System.out.println();

        // Computation of the factorial of a number
        System.out.println("Computing factorial of a number");
        System.out.println("Factorial of 3 is " + fact(3));
        System.out.println();
        System.out.println("Factorial of 5 is " + fact(5));
        System.out.println();
        System.out.println();
    }

    // callMyself prints the given number, subtracts one from it, and then calls itself again, until reaching zero
    public static void callMyself(long i) {
        if (i < 0) {
            return;
        } else {
            System.out.println("i = " +i);
            i = i - 1;
            callMyself(i);
        }
    }

    // sumOfAllNumbers returns a number that represents an ongoing sum
    // it keeps adding the given number minus 1, until hitting 0
    // at that point the sum of all numbers from the given number to 0 has been calculated
    public static int sumOfAllNumbers(int i) {
        if (i != 0) { // continue recursive loop, counting down
            return i + sumOfAllNumbers(i - 1);
        } else { // i reached 0, now stopping recursive loop
            return i;
        }
    }

    // factorial example
    public static int fact(int i) {
        int result;
        System.out.println("this is call... " + i);
        if(i==1) return 1;
        result = fact(i-1) * i;
        return result;
    }
}
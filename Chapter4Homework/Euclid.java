package Chapter4Homework;

import java.util.Scanner;

/**
* Created by nraley on 10/26/15.
*/
public class Euclid {

    public static void main(String[] args) {
        int m = 1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        Euclid e = new Euclid();
        while (m > 0) {
            System.out.println("Enter first integer or a negative number to end: ");
            if (scanner.hasNextInt())
                m = scanner.nextInt();
            else
            {
                System.out.println("Error: you must enter an integer.");
                System.out.println("Terminating program.");
            }
            if (m > 0) {
                System.out.println("Enter second integer: ");
                if (scanner.hasNextInt())
                    n = scanner.nextInt();
                else {
                    System.out.println("Error: you must enter an integer.");
                    System.out.println("Terminating program.");
                }

                System.out.println("Greatest common divisor is: ");
                System.out.println(e.gcdRecursive(m, n));
            }
        }
    }
    public int gcdRecursive(int m, int n) {
        if (m < n) {
            int tempM = m;
            int tempN = n;
            m = tempN;
            n = tempM;
            return gcdRecursive(m, n);
        } else if (m % n == 0) {
            return n;
        } else {
            return gcdRecursive(n, m % n);
        }
    }
}

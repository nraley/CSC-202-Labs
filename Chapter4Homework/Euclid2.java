package Chapter4Homework;

import java.util.Scanner;

/**
 * Created by nraley on 10/26/15.
 */
public class Euclid2 {
    public static void main(String[] args) {
        int m = 1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        Euclid2 e = new Euclid2();
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
                System.out.println(e.gcdIterative(m, n));
            }
        }
    }
    public static int gcdIterative(int m, int n) //valid for positive integers.
    {
        while(n > 0)
        {
            int c = m % n;
            m = n;
            n = c;
        }
        return m;
    }
}
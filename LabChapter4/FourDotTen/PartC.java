package LabChapter4.FourDotTen;

/**
 * Created by nraley on 10/17/15.
 */
public class PartC {
    public static void main(String[] args) {

        PartA A = new PartA();
        PartB B = new PartB();

        System.out.println("First 5 values using recursion: \n");
        for (int i = 0; i < 5; i++)
            System.out.println(A.fibonacci(i));
        System.out.println("\n First 5 values without using recursion: \n");
        for (int i = 0; i < 5; i++)
            System.out.println(B.fibonacciNonRecursive(i));
    }
}

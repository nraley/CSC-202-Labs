package LabChapter4.FourDotTen;

/**
* Created by nraley on 10/17/15.
*/
public class PartB {
    public int fibonacciNonRecursive(int n) {
        int ante = 1;
        int current = 1;

        if (n == 0)
            return n;
        else if (n == 1)
            return n;
        else for (int i = 2; i < n; i++) {
                int t = current;
                current += ante;
                ante = t;
            }
        return current;
    }
}
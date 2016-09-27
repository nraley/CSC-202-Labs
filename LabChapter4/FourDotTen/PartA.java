package LabChapter4.FourDotTen;

/**
 * Created by nraley on 10/17/15.
 */
public class PartA {

    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return  fibonacci(n - 1) + fibonacci(n - 2);
    }
}

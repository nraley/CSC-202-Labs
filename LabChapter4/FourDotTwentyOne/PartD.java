package LabChapter4.FourDotTwentyOne;

/**
 * Created by nraley on 10/17/15.
 */
public class PartD {

    public static void main(String[] args) {
        PartB b = new PartB();
        System.out.println("Recursive solution: ");
        System.out.println(b.sqrRoot(64, 7, 0.5) + "\n");

        PartC c = new PartC();
        System.out.println("Iterative solution: ");
        System.out.println(c.sqrRootNonRecursive(64, 7, 0.5));
    }
}

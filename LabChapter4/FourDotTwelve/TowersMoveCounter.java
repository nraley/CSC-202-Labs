package LabChapter4.FourDotTwelve;

/**
 * Created by nraley on 10/17/15.
 */
import java.util.Scanner;

public class TowersMoveCounter
{
    private static String indent = "";  // indentation for trace
    public static int count;

    public static void main(String[] args)
    {
        Scanner conIn = new Scanner(System.in);
        //        Number of rings on starting peg.
        int n = 1;
        while (n > 0) {
            count = 0;
            //        Number of rings on starting peg.
            System.out.print("Input the number of rings or a negative number to end: ");
            if (conIn.hasNextInt())
                n = conIn.nextInt();
            else
            {
                System.out.println("Error: you must enter an integer.");
                System.out.println("Terminating program.");
                return;
            }

//        System.out.println("Towers of Hanoi with " + n + " rings\n");
            if (n > 0) {
                doTowers(n, 1, 2, 3);
                System.out.println("Moves required to solve: " + count);
            }
        }

////        Number of rings on starting peg.
//        int n;
//        System.out.print("Input the number of rings or 'end' to end: ");
//        if (conIn.hasNextInt())
//            n = conIn.nextInt();
//        else
//        {
//            System.out.println("Error: you must enter an integer.");
//            System.out.println("Terminating program.");
//            return;
//        }
//
//        System.out.println("Towers of Hanoi with " + n + " rings\n");
//        doTowers(n, 1, 2, 3);
//
//        System.out.println("Moves required to solve: " + count);
    }

    public static void doTowers(
            int n,              // Number of rings to move
            int startPeg,       // Peg containing rings to move
            int auxPeg,         // Peg holding rings temporarily
            int endPeg      )   // Peg receiving rings being moved
    {
        if (n > 0)
        {
            indent = indent + "  ";

//            System.out.println(indent + "Get " + n + " rings moved from peg " +
//                    startPeg + " to peg " + endPeg);

            // Move n - 1 rings from starting peg to auxiliary peg
            doTowers(n - 1, startPeg, endPeg, auxPeg);

//            // Move nth ring from starting peg to ending peg
//            System.out.println(indent + "Move ring " + n + " from peg " + startPeg
//                    + " to peg " + endPeg);

            // Move n - 1 rings from auxiliary peg to ending peg
            doTowers(n - 1, auxPeg, startPeg, endPeg);

            indent = indent.substring(2);

            count++;
        }
    }
}

package LabChapter6;

/**
 * Created by nraley on 10/18/15.
 */
import java.util.Scanner;

public class GolfApp
{
    public static void main(String[] args)
    {
        Scanner conIn = new Scanner(System.in);

        String name;          // golfer's name
        int score;            // golfer's score

        ListInterface<Golfer> golfers = new ArraySortedList<Golfer>(20);
        Golfer golfer;

        String skip;  // Used to skip rest of input line after reading integer

        System.out.print("Golfer name (press Enter to end): ");
        name = conIn.nextLine();
        while (!name.equals(""))
        {
            System.out.print("Score: ");
            score = conIn.nextInt();
            skip = conIn.nextLine();

            golfer = new Golfer(name, score);
            golfers.add(golfer);

            System.out.print("Golfer name (press Enter to end): ");
            name = conIn.nextLine();
        }
        System.out.println();
        System.out.println("The final results are");
        System.out.println(golfers);
    }
}
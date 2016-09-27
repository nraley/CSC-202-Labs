package LabChapter5.FiveDotTwentyThree;


import LabChapter5.ArrayUnbndQueue;
import java.util.Scanner;
/**
 * Created by nraley on 11/15/15.
 */
public class EnterStrings {
    public static void main(String[] args) {
        ArrayUnbndQueue<String> males = new ArrayUnbndQueue<String>();
        ArrayUnbndQueue<String> females = new ArrayUnbndQueue<String>();
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("Input a gender and a name or 'x done' to quit: ");
            String input = scan.next();
            if(input.equals("x")){
                break;
            }
            else if(input.equals("m")){
                males.enqueue(scan.next());
            }
            else if(input.equals("f")){
                females.enqueue(scan.next());
            }
        }

        System.out.println("\nMales: ");
        while (!males.isEmpty()) {
            System.out.print(males.dequeue() + " ");
        }

        System.out.println("\n\nFemales: ");
        while (!females.isEmpty()) {
            System.out.print(females.dequeue() + " ");
        }
    }
}
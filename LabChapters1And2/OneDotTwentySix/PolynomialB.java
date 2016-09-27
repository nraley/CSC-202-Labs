package LabChapters1And2.OneDotTwentySix;
import java.util.Scanner;
/**
 * Created by Nelson Raley on 9/13/15.
 */
public class PolynomialB {
    public static void main(String[] args) {
        int degree = Integer.parseInt(args[0]);
        PolynomialA cmdPoly = new PolynomialA(degree);

        for (int i = degree; i >= 0; i--) {
            cmdPoly.setCoefficient(i, Integer.parseInt(args[i + 1]));
        }

        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a value> ");
            float enteredValue = myScanner.nextInt();
            System.out.println("The result is " + cmdPoly.evaluate(enteredValue));
            System.out.println("Continue?> ");
            String continuePrompt = myScanner.next();
            if (continuePrompt.toUpperCase().equals("NO")) {
                break;
            }
        }
    }
}

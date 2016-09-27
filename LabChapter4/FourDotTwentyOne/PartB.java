package LabChapter4.FourDotTwentyOne;

/**
 * Created by nraley on 10/17/15.
 */
import static java.lang.Math.abs;

public class PartB {
     public double sqrRoot(double number, double approx, double tol) {
         if (abs((approx * approx) - number) <= tol) {
             return approx;
         } else {
             return sqrRoot(number, ((approx * approx) + number)/(2 * approx), tol);
         }
     }
}

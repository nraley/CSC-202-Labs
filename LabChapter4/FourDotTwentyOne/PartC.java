package LabChapter4.FourDotTwentyOne;

import static java.lang.Math.abs;

/**
 * Created by nraley on 10/17/15.
 */
public class PartC {
    public double sqrRootNonRecursive(double number, double initialApprox, double tol) {

        double approx = initialApprox;
        double delta = abs((approx * approx) - number);

        while (delta > tol) {
            approx = ((approx * approx) + number)/(2 * approx);
            delta = abs((approx * approx) - number);
        }
        return approx;
    }
}

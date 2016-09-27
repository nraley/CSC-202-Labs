package LabChapters1And2.OneDotTwentySix;

/**
 * Created by Nelson Raley on 8/31/15.
 */
public class PolynomialA {

    private int[] coefficients;

    public PolynomialA(int degree) {
        this.coefficients = new int[degree + 1];
    }

    public void setCoefficient (int termDegree, int termCoeff) {
        coefficients[termDegree] = termCoeff;
    }

    public float evaluate (float xValue) {
        float solution = 0;
        for (int i = 0; i < coefficients.length; i++) {
//            System.out.println(i + ": " + coefficients[i] + ", " + power(xValue, i) + ", " + solution);
            solution += (power(xValue, i) * coefficients[i]);
        }
        return solution;
    }

    public int getDegree() {
        return coefficients.length - 1;
    }

    public float power(float base, int power) {
        if (power == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        float result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}

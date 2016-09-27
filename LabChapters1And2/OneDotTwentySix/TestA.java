package LabChapters1And2.OneDotTwentySix;

/**
 * Created by Nelson Raley on 9/13/15.
 */
public class TestA {

    public static void main(String[] args) {
        PolynomialA myPoly = new PolynomialA(3);
        myPoly.setCoefficient(3, 5);
        myPoly.setCoefficient(1, 2);
        myPoly.setCoefficient(0, -3);

        System.out.println(myPoly.evaluate(0));
        System.out.println(myPoly.evaluate(1));
        System.out.println(myPoly.evaluate(0.5f));
    }
}

package LabChapter3.ThreeDotFortyFour;

/**
 * Created by nraley on 9/28/15.
 */
public class ThreeDotFortyFourTest {
    public static void main(String[] args) {
        LinkedStackPopSome<Integer> myLinked2 = new LinkedStackPopSome<Integer>();

        myLinked2.push(2);
        myLinked2.push(5);
        myLinked2.push(8);
        myLinked2.push(4);
        myLinked2.push(24);
        myLinked2.popSome(3);
        System.out.println(myLinked2);
    }
}

package LabChapter3.ThreeDotThirtyFour;

/**
 * Created by nraley on 9/27/15.
 */
public class ThreeDotThirtyFourTest {
    public static void main(String[] args) {
        ArrayStackPopSome<Integer> myStack2 = new ArrayStackPopSome<Integer>();

        myStack2.push(86);
        myStack2.push(4);
        myStack2.push(46);
        myStack2.push(2);
        myStack2.push(74);
        myStack2.popSome(3);
        System.out.println(myStack2);
    }
}

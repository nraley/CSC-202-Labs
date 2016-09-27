package LabChapter3.ThreeDotFortyFive;

import LabChapter3.ThreeDotFortyFour.LinkedStackPopSome;

/**
 * Created by nraley on 9/28/15.
 */
public class PopTopTest {
    public static void main(String[] args) {
        LinkedStackPopSome<Integer> myLinked2 = new LinkedStackPopSome<Integer>();

        myLinked2.push(2);
        myLinked2.push(5);
        myLinked2.push(8);
        myLinked2.push(4);
        myLinked2.push(24);
        System.out.println(myLinked2.popTop());
        System.out.println(myLinked2);
    }
}

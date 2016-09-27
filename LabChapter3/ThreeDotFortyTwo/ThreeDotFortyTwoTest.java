package LabChapter3.ThreeDotFortyTwo;

import LabChapter3.LinkedStack;

/**
 * Created by nraley on 9/28/15.
 */
public class ThreeDotFortyTwoTest {
    public static void main(String[] args) {
        LinkedStackToString<Integer> myLinked = new LinkedStackToString<Integer>();

        myLinked.push(3);
        myLinked.push(5);
        myLinked.push(73);
        myLinked.push(3);
        System.out.println(myLinked);
    }
}

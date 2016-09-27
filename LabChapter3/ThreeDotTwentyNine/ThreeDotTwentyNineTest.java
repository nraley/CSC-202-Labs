package LabChapter3.ThreeDotTwentyNine;

import LabChapter3.ArrayStack;

/**
 * Created by nraley on 9/27/15.
 */
public class ThreeDotTwentyNineTest {

    public static void main(String[] args) {
        ArrayStackToString<Integer> myStack = new ArrayStackToString<Integer>();

        myStack.push(6);
        myStack.push(3);
        myStack.push(9);
        myStack.push(38);
        myStack.pop();
        System.out.println(myStack);
    }
}

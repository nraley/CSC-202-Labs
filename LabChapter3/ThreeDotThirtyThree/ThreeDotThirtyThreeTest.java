package LabChapter3.ThreeDotThirtyThree;

import LabChapter3.ArrayStack;

/**
 * Created by nraley on 9/27/15.
 */
public class ThreeDotThirtyThreeTest {
    public static void main(String[] args) {
        ArrayStackInspector<Integer> myStack1 = new ArrayStackInspector<Integer>();

        myStack1.push(4);
        myStack1.push(8);
        myStack1.push(94);
        myStack1.push(43);
        myStack1.toString();
        System.out.println(myStack1.inspector(1));;
    }
}

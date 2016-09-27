package LabChapter3.ThreeDotFortyThree;

import LabChapter3.LLNode;

/**
 * Created by nraley on 9/28/15.
 */
public class ThreeDotFortyThreeTest {

    public static void main(String[] args) {
        LinkedStackInspector<Integer> myLinked1 = new LinkedStackInspector<Integer>();

        myLinked1.push(2);
        myLinked1.push(7);
        myLinked1.push(4);
        myLinked1.push(9);

//        System.out.println(myLinked1.inspector(3));
//        try {
//            myLinked1.inspector(-3);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e);
//        }
//        System.out.println(myLinked1.inspector(0));
        System.out.println(myLinked1.inspector(1));
    }

}

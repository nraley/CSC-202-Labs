package LabChapter5.FiveDotThirtyOne;

import LabChapter5.LinkedUnbndQueue;

/**
 * Created by nraley on 11/16/15.
 */
public class FrontMethodTest {

    public static void main(String[] args) {

        FrontMethod<Integer> myQueue = new FrontMethod<Integer>();

        for (int i = 1; i <= 5; i++) {
            myQueue.enqueue(i);
        }
        myQueue.toString();

        System.out.println(myQueue.front());    //Instead of making front() take a queue value,
                                                //I made queue take no arguments and ran the
                                                //method on the myQueue object.
    }
}
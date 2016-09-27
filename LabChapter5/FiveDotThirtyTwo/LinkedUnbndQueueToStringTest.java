package LabChapter5.FiveDotThirtyTwo;

/**
 * Created by nraley on 11/16/15.
 */
public class LinkedUnbndQueueToStringTest {
    public static void main(String[] args) {
        LinkedUnbndQueueToString<Integer> myLinkedQueue = new LinkedUnbndQueueToString<Integer>();

        for (int i = 1; i <= 5; i++) {
            myLinkedQueue.enqueue(i);
        }

        System.out.println(myLinkedQueue.toString());
    }
}
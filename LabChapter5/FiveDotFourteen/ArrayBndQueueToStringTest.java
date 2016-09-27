package LabChapter5.FiveDotFourteen;

import LabChapter5.ArrayBndQueue;

/**
 * Created by nraley on 11/15/15.
 */
public class ArrayBndQueueToStringTest {
    public static void main(String[] args) {
        ArrayBndQueueToString<String> myQueue1 = new ArrayBndQueueToString<String>();

        myQueue1.enqueue("A");
        myQueue1.enqueue("B");
        myQueue1.enqueue("C");

        System.out.println("Rear is in back of front");
        System.out.println(myQueue1.toString());

        ArrayBndQueueToString<String> myQueue2 = new ArrayBndQueueToString<String>(5);

        myQueue2.enqueue("1");
        myQueue2.enqueue("2");
        myQueue2.enqueue("3");
        myQueue2.enqueue("4");
        myQueue2.enqueue("5");
        myQueue2.dequeue();
        myQueue2.enqueue("1");

        System.out.println("Rear is in front of front");
        System.out.println(myQueue2.toString());
    }
}

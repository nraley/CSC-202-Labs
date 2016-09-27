package LabChapter5.FiveDotThirtyTwo;

import LabChapter5.LinkedUnbndQueue;

/**
 * Created by nraley on 11/16/15.
 */
public class LinkedUnbndQueueToString<T> extends LinkedUnbndQueue<T> {

    public LinkedUnbndQueueToString() {
        super();
    }

    public String toString() {
        String result = "";

        while (!isEmpty()) {
            result += (dequeue() + " ");        //INCORRECT, should use iterate through indexes
        }
        return result;
    }
}
package LabChapter5.FiveDotFourteen;

import LabChapter5.ArrayBndQueue;

import javax.swing.text.DefaultEditorKit;

/**
 * Created by nraley on 11/9/15.
 */
public class ArrayBndQueueToString<T> extends ArrayBndQueue<T> {

    public ArrayBndQueueToString() {
        super();
    }

    public ArrayBndQueueToString(int maxSize) {
        super(maxSize);
    }

    public String toString() {
        String result = "";

        for (int i = front; i != rear; i = (i + 1) % queue.length) {
            result += queue[i] + " ";
        }

        result += queue[rear];
        return result;
    }
}


//  Part b: In order to make this toString method work with the ArrayUnbndQueue
//  class, I'd only have to use a while loop to traverse the queue instead of a
//  complex for loop, just as I would with any other reference-based ADT.
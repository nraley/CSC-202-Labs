package LabChapter6.SixDotTwentyThree;

import LabChapter6.ArrayUnsortedList;

/**
 * Created by nraley on 10/18/15.
 */
public class ArrayUnsortedListIsEmpty<T> extends ArrayUnsortedList<T> {
    public boolean isEmpty() {
        if ( numElements > 0 ) {
            return false;
        } else { return true; }
    }
}
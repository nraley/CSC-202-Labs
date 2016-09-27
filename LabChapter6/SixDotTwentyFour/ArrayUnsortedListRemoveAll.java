package LabChapter6.SixDotTwentyFour;

import LabChapter6.ArrayUnsortedList;

/**
 * Created by nraley on 10/18/15.
 */
public class ArrayUnsortedListRemoveAll<T> extends ArrayUnsortedList<T> {
    public int removeAll(T target) {

        location = 0;
        int removedCount = 0;

        while (location < numElements) {
            if (list[location].equals(target)) {
                remove(list[location]);
                removedCount++;
            }
            location++;
        }
        return removedCount;
    }
}
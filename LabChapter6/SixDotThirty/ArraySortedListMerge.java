package LabChapter6.SixDotThirty;

import LabChapter6.ArraySortedList;

/**
 * Created by nraley on 10/18/15.
 */
public class ArraySortedListMerge<T> extends ArraySortedList {
    void merge(ArraySortedList<T> list) {
        list.reset();
        for (int i = 0; i < list.size(); i++) {
            this.add(list.getNext());
        }
    }
}
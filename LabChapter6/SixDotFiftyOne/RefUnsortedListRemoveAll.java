package LabChapter6.SixDotFiftyOne;

import LabChapter6.LLNode;
import LabChapter6.RefUnsortedList;

/**
 * Created by nraley on 10/18/15.
 */
public class RefUnsortedListRemoveAll<T> extends RefUnsortedList<T> {

    public int removeAll(T target) {
        LLNode<T> current = list;
        LLNode<T> previous = null;
        int count = 0;
        while (current != null) {
            if (target == current.getInfo()) {
                if (previous == null) {
                    // we are removing the first node in the list
                    list = current.getLink();
                } else {
                    previous.setLink(current.getLink());
                }
            } else {
                previous = current;
            }
            current = current.getLink();
            count++;
        }
        return count;
    }
}

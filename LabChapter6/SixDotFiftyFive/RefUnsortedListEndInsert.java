package LabChapter6.SixDotFiftyFive;

import LabChapter6.LLNode;
import LabChapter6.RefUnsortedList;
/**
 * Created by nraley on 10/18/15.
 */
public class RefUnsortedListEndInsert<T> extends RefUnsortedList<T> {
    public void endInsert(T element) {
        if (list == null) {
            add(element);
            return;
        }
        LLNode<T> current = list;
        while (current.getLink() != null) {
            current = current.getLink();
        }
        LLNode<T> node = new LLNode<T>(element);
        current.setLink(node);
    }
}
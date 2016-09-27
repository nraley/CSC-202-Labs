package LabChapter3.ThreeDotFortyThree;

import LabChapter3.LinkedStack;
import LabChapter3.LLNode;

/**
 * Created by nraley on 9/28/15.
 */
//public class LinkedStackInspector<T> extends LinkedStack<T> {
//
//    public T inspector(int location) {
//
//        if (location < 0) {
//            throw new IllegalArgumentException("Entry cannot be negative number.");  //if location is negative
//        }
//
//        if (isEmpty()) {throw new RuntimeException("List is empty.");} //if list is empty
//
//        LLNode<T> node = top;
//
//        T info = null;
//        for (int i = 0; i < location + 1; i++){
//            if (node == null) {
//                throw new RuntimeException("List only has " + (i + 1) + " elements.");   //if location called is larger than list
//            }
//            info = node.getInfo();
//            node = node.getLink();
//        }
//
//        return info;
//    }
//}

public class LinkedStackInspector<T> extends LinkedStack<T> {

    public T inspector(int location) {

        if (location < 0) {
            throw new IllegalArgumentException("Entry cannot be negative number.");  //if location is negative
        }

        if (isEmpty()) {throw new RuntimeException("List is empty.");} //if list is empty

        LLNode<T> node = top;

        T info = null;
        for (int i = 0; i < location; i++){
            if (node == null) {
                throw new RuntimeException("List only has " + (i + 1) + " elements.");   //if location called is larger than list
            }
            info = node.getInfo();
            node = node.getLink();
        }

        return info;
    }
}
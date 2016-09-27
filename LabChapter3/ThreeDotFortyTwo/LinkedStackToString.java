package LabChapter3.ThreeDotFortyTwo;

import LabChapter3.LinkedStack;
import LabChapter3.LLNode;

/**
 * Created by nraley on 9/28/15.
 */

public class LinkedStackToString<T> extends LinkedStack<T> {
    public String toString() {
        LLNode node = top;
        StringBuffer sb = new StringBuffer();
        sb.append("Stack Contents:\n");

        while (node != null){
            sb.append(node.getInfo());
            sb.append("\n");
            node = node.getLink();
        }

        return sb.toString();
    }
}
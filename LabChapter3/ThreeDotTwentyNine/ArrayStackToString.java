package LabChapter3.ThreeDotTwentyNine;

import LabChapter3.ArrayStack;

/**
 * Created by nraley on 9/27/15.
 */
public class ArrayStackToString<T> extends ArrayStack<T> {

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Stack Contents:\n");

//        for (int i = 0; i <= topIndex; i++) {
//            sb.append(stack[i]);
//            sb.append("\n");
//        }
        for (int i = topIndex; i >= 0; i--) {
            sb.append(stack[i]);
            sb.append("\n");
        }

        return sb.toString();
    }
}

package LabChapter3.ThreeDotFortyFour;

import LabChapter3.LinkedStack;
import LabChapter3.ThreeDotFortyTwo.LinkedStackToString;

/**
 * Created by nraley on 9/28/15.
 */
public class LinkedStackPopSome<T> extends LinkedStackToString<T>{
    public void popSome(int count) {
        for (int i = 0; i < count; i++) {
            pop();
        }
    }
}

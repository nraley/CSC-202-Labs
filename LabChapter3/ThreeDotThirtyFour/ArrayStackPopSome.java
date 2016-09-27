package LabChapter3.ThreeDotThirtyFour;

import LabChapter3.ThreeDotTwentyNine.ArrayStackToString;

/**
 * Created by nraley on 9/27/15.
 */
public class ArrayStackPopSome<T> extends ArrayStackToString<T> {
    public void popSome(int count) {
        for (int i = 0; i < count; i++){
            pop();
        }
    }
}

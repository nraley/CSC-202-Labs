package LabChapter3.ThreeDotThirtyThree;

import LabChapter3.ArrayStack;

/**
 * Created by nraley on 9/27/15.
 */
public class ArrayStackInspector<T> extends ArrayStack<T> {

//    public T inspector (int index) {
//        return stack[index];
//    }
    public T inspector (int location) {
        int size = sizeIs();
        int index = (size - location);
        return stack[index];
    }
}
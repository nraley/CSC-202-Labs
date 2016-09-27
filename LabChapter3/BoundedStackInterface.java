package LabChapter3;

import LabChapter3.StackInterface;
import LabChapter3.StackOverflowException;

/**
 * Created by nraley on 9/27/15.
 */
public interface BoundedStackInterface<T> extends StackInterface<T>

{
    void push(T element) throws StackOverflowException;
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.

    boolean isFull();
    // Returns true if this stack is full, otherwise returns false.

}

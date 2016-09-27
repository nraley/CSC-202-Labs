package LabChapter3;

/**
 * Created by nraley on 9/28/15.
 */
public interface UnboundedStackInterface<T> extends StackInterface<T>

{
    void push(T element);
    // Places element at the top of this stack.

}


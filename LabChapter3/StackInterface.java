package LabChapter3;

import LabChapter3.StackUnderflowException;

/**
 * Created by nraley on 9/27/15.
 */
public interface StackInterface<T>

{
    void pop() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.

    T top() throws StackUnderflowException;
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.

    boolean isEmpty();
    // Returns true if this stack is empty, otherwise returns false.

    public T popTop() throws StackUnderflowException;
    //Throws StackUnderflowException if this stack is empty.
    //Otherwise removes and returns top element from this stack.
}
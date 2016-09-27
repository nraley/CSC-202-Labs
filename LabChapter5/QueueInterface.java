package LabChapter5;

/**
 * Created by nraley on 11/9/15.
 */
public interface QueueInterface<T>

{
    T dequeue() throws QueueUnderflowException;
    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.

    boolean isEmpty();
    // Returns true if this queue is empty; otherwise, returns false.
}

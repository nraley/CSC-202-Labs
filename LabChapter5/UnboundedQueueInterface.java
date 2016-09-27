package LabChapter5;

/**
 * Created by nraley on 11/16/15.
 */
public interface UnboundedQueueInterface<T> extends QueueInterface<T>

{
    void enqueue(T element);
    // Adds element to the rear of this queue.
}


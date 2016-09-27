package LabChapter5.FiveDotThirtyOne;

import LabChapter5.ArrayUnbndQueue;
import LabChapter5.LinkedUnbndQueue;
import LabChapter3.LLNode;
import LabChapter5.QueueUnderflowException;
import LabChapter5.UnboundedQueueInterface;
import LabChapters1And2.OneDotFortyThree.IntArrayLoop;

/**
 * Created by nraley on 11/16/15.
 */
public class FrontClient<T> {

    public T front(UnboundedQueueInterface<T> queue) {
        LinkedUnbndQueue<T> tempQueue = new LinkedUnbndQueue<T>();

        if (queue.isEmpty()) {
            throw new QueueUnderflowException();
        }

        T value = queue.dequeue();
        tempQueue.enqueue(value);
        while (!queue.isEmpty()) {
            tempQueue.enqueue(queue.dequeue());
        }

        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }

        return value;
    }

    public static void main(String[] args) {
        LinkedUnbndQueue<Integer> myQueue = new LinkedUnbndQueue<Integer>();

        for (int i = 1; i <= 5; i++) {
            myQueue.enqueue(i);
        }

        FrontClient<Integer> client = new FrontClient<Integer>();
        System.out.println(client.front(myQueue));
    }
}

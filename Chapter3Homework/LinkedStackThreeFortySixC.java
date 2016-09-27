package Chapter3Homework;

import LabChapter3.LLNode;
import LabChapter3.StackUnderflowException;
import LabChapter3.UnboundedStackInterface;

/**
 * Created by nraley on 10/5/15.
 */
public class LinkedStackThreeFortySixC<T> implements UnboundedStackInterface<T>
{
    protected LLNode<T> top;   // reference to the top of this stack
    protected int size;

    public LinkedStackThreeFortySixC()
    {
        top = null;
        size = 0;
    }

    public void push(T element)
    // Places element at the top of this stack.
    {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
        size++;
    }

    public void pop()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    {
        if (!isEmpty())
        {
            top = top.getLink();
        }
        else
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        size--;
    }

    public T top()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element from this stack.
    {
        if (!isEmpty())
            return top.getInfo();
        else
            throw new StackUnderflowException("Top attempted on an empty stack.");
    }

    public boolean isEmpty()
    // Returns true if this stack is empty, otherwise returns false.
    {
        if (top == null)
            return true;
        else
            return false;
    }

    public T popTop() {
        if (isEmpty()) {throw new StackUnderflowException();}
        LLNode<T> node = top;
        top = node.getLink();
        size--;
        return node.getInfo();
    }

    public int sizeIs() {
//        LLNode<T> node = top;
//        int count = 0;
//        while (node != null) {
//            node = node.getLink();
//            count++;
//        }
//
//        return count;
          return size;
    }
}

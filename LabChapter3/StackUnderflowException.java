package LabChapter3;

/**
 * Created by nraley on 9/27/15.
 */
public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException()
    {
        super();
    }

    public StackUnderflowException(String message)
    {
        super(message);
    }
}
package LabChapter3;

/**
 * Created by nraley on 9/27/15.
 */
public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        super();
    }

    public StackOverflowException(String message)
    {
        super(message);
    }
}
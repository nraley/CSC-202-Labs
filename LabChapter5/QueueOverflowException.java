package LabChapter5;

/**
 * Created by nraley on 11/9/15.
 */
public class QueueOverflowException extends RuntimeException
{
    public QueueOverflowException()
    {
        super();
    }

    public QueueOverflowException(String message)
    {
        super(message);
    }
}

package LabChapter5;

/**
 * Created by nraley on 11/9/15.
 */
public class QueueUnderflowException extends RuntimeException
{
    public QueueUnderflowException()
    {
        super();
    }

    public QueueUnderflowException(String message)
    {
        super(message);
    }
}
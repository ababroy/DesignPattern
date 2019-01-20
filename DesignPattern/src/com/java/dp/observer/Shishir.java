package com.java.dp.observer;

/**
 * 
 * @author royabhix
 *
 */
public class Shishir
    implements Observer
{
    @Override
    public void update ( String info )
    {
        System.out.println( "Hey Shishir a new STT version " + info + " released, now you can start work on filter performance for next release." );
    }
}

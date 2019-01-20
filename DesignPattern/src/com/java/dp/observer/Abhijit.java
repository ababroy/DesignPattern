package com.java.dp.observer;

/**
 * 
 * @author royabhix
 *
 */
public class Abhijit
    implements Observer
{
    @Override
    public void update ( String info )
    {
        System.out.println( "Hey Abhijit a new STT version " + info + " released recently, So update it first!" );
    }
}

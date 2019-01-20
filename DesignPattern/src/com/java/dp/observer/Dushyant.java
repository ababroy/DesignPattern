package com.java.dp.observer;

/**
 * 
 * @author royabhix
 *
 */
public class Dushyant
    implements Observer
{
    @Override
    public void update ( String info )
    {
        System.out.println( "Hey Dushyant the new STT version " + info + " got fixes for your all soco issues." );
    }
}

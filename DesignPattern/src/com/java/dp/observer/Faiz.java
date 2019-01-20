package com.java.dp.observer;

/**
 * 
 * @author royabhix
 *
 */
public class Faiz
    implements Observer
{

    @Override
    public void update ( String info )
    {
        System.out.println( "Hello Faiz a new STT version " + info + " released recently but you need to change the decoder flow to the next release." );
    }

}

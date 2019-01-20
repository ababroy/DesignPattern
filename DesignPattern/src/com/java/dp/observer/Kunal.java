package com.java.dp.observer;

public class Kunal
    implements Observer
{
    @Override
    public void update ( String info )
    {
        System.out.println( "Hey Kunal a new STT version " + info + " released recently but you don't care about it." );
    }
}

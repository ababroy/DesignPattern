package com.java.dp.observer;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * @author royabhix
 *
 */
public class SystemTraceTool
    implements ObserverFunction
{
    public SystemTraceTool ( String info )
    {
        this.sttVersion = info;
    }

    Set< Observer > observerSet = new LinkedHashSet<>();

    String sttVersion;

    @Override
    public void subscribe ( Observer observer )
    {
        observerSet.add( observer );
    }

    @Override
    public void unsubscribe ( Observer observer )
    {
        observerSet.remove( observer );
    }

    @Override
    public void notifyToAll ()
    {
        for ( Observer observer : observerSet )
        {
            System.out.println( "New Notification for STT!!!" );
            observer.update( this.sttVersion );

            /** going to sleep */
            try
            {
                Thread.sleep( 3000 );
            }
            catch ( InterruptedException e )
            {
                e.printStackTrace();
            }
        }
    }

}

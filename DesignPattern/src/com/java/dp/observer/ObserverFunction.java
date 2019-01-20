package com.java.dp.observer;

/**
 * 
 * @author royabhix
 *
 */
public interface ObserverFunction
{
    void subscribe ( Observer observer );

    void unsubscribe ( Observer observer );

    void notifyToAll ();
}

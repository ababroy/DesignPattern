package com.java.dp.singleton;

public class Singleton
{
    private volatile static Singleton singleton;
    
    private Singleton()
    {
        System.out.println( "Singleton class has been created..." );
    }
    
    public static Singleton getInstance()
    {
        if(singleton == null)
        {
            synchronized(Singleton.class)
            {
                if(singleton == null)
                {
                    singleton = new Singleton();
                }
            }
            
        }
        return singleton;
    }
}




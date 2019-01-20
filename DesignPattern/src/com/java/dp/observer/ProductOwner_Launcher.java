package com.java.dp.observer;

/**
 * 
 * @author royabhix
 *
 */
public class ProductOwner_Launcher
{
    public static void main ( String[] args )
    {
        /** List of Observer names */
        Faiz faiz = new Faiz();
        Shishir shishir = new Shishir();
        Abhijit abhijit = new Abhijit();
        Kunal kunal = new Kunal();
        Dushyant dushyant = new Dushyant();

        /** STT registration */
        SystemTraceTool stt = new SystemTraceTool( "STT-19.05.0000" );
        stt.subscribe( faiz );
        stt.subscribe( shishir );
        stt.subscribe( kunal );
        stt.subscribe( dushyant );
        stt.subscribe( abhijit );

        /** STT notification */
        stt.notifyToAll();
    }
}

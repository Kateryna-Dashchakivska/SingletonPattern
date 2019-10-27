package com.SinglePattern;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Starting the app..." );
        Browser ie = new Browser();
        ie.openURL("www.myURL.com");
    }
}

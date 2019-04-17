package com.sparta.sj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        UserDetails sam = new UserDetails("Sam", 27, "sam@lordSam.com");
        System.out.println( sam.getUserDetails().getClass());
    }
}

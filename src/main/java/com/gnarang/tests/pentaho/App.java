package com.gnarang.tests.pentaho;

import org.pentaho.di.job.entries.special.JobEntrySpecial;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        //
        JobEntrySpecial jb = new JobEntrySpecial();
        jb.setName("Start");
        jb.setStart(true);
        System.out.println( "Hello World!" );
    }
}

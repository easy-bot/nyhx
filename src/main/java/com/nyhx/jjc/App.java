package com.nyhx.jjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow","{}%");
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}

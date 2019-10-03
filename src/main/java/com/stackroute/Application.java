package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.stackroute")

public class Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        Application application = context.getBean(Application.class);
        application.start();



//        Message msg = context.getBean(Message.class);
//        System.out.println("hello Again : " + msg.getMessage());

    }

    @Autowired
    // @Qualifier("message")  // could use this if it was created using interface and that was implemented to multiple classes
     private Message message;

    private void start(){
        System.out.println("message : "+message.getMessage());
    }


}

package com.stackroute;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("message")
// @Primary  // can use this if multiple class were implemented from interface

public class Message {

    private String message = "This is for Spring";

    public Message(){}

    public Message(String message){
        this.message=message;
    }


    public String getMessage(){
       return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

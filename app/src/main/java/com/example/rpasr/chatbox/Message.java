package com.example.rpasr.chatbox;

public class Message {

    String inputData;

    public Message ( String data){
        this.inputData = data;
    }

    public String getMessage (){
        return  inputData;
    }

}

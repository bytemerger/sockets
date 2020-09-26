package com.project.chat.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SocketMessage {
    private String message;
    private String time;

    public SocketMessage(String message){
        this.message = message;
        this.time = new SimpleDateFormat("HH:mm").format(new Date());
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}

package com.project.chat.controller;

import com.project.chat.model.Message;
import com.project.chat.model.SocketMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class MessageController {
    @MessageMapping("/send")
    @SendTo("/topic/message")
    public SocketMessage sendMessage(@RequestBody Message message){
        return new SocketMessage(message.getMessage());
    }
}

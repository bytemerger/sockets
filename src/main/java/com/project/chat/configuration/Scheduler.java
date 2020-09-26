package com.project.chat.configuration;

import com.project.chat.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;

@EnableScheduling
@Configuration
public class Scheduler {
    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 1000)
    public void timeSchedule(){
        template.convertAndSend("/topic/message",new Message("Jsut checking on you"));
    }
}

package com.sandeep;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

//@Controller
//public class ChatController {
//
//    @MessageMapping("/chat.send")
//    @SendTo("/topic/public")
//    public ChatMessage sendMessage(ChatMessage message) {
//        return message;
//    }
@Controller
public class ChatController {

    @MessageMapping("/chat.send")  // Matches "/app/chat.send"
    @SendTo("/topic/public")
    public ChatMessage sendMessage(ChatMessage message) {
        System.out.println("Received message: " + message.getContent() + " from " + message.getSender());
        return message;
    }
}
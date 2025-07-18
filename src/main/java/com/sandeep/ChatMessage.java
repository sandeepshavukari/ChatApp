package com.sandeep;

public class ChatMessage {
    private String content;
    private String sender;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Constructors, getters, and setters
    public ChatMessage() {
    }

    public ChatMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    // Add getters and setters
}
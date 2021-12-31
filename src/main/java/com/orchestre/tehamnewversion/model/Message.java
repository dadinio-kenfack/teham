package com.orchestre.tehamnewversion.model;

public class Message {

    private String name = "start";

    public Message() {}

    public Message(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

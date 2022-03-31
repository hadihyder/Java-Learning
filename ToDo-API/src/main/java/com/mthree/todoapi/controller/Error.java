package com.mthree.todoapi.controller;

import java.time.LocalDateTime;

public class Error {

    private LocalDateTime timeStamp = LocalDateTime.now();
    private String message;

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.example.demo.coupang;

import lombok.Getter;

@Getter
public enum MessageType {
    THANK("감사합니다", "SMS"),
    SORRY("죄송합니다", "email");

    private final String message;
    private final String type;

    private MessageType(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

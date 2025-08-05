package com.ozmenyavuz.entity;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1001", "RECORD NOT FOUND"),
    GENERAL_EXCEPTION("9999", "GENERAL ERROR OCCURRED");

    private final String code;
    private final String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
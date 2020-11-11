package com.upgrad.hirewheels.responses;

import java.time.LocalDateTime;

public class CustomResponse {
    private LocalDateTime timeStamp;
    private String errorMessage;
    private int statusCode;

    public CustomResponse() {
    }
    public CustomResponse(LocalDateTime timeStamp,String errorMessage, int statusCode) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}


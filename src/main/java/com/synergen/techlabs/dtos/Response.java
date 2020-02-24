package com.synergen.techlabs.dtos;


import com.synergen.techlabs.utlis.DateTimeUtil;

import java.time.LocalDateTime;


public class Response {

    private String message;
    private int statusCode;
    private String timeStamp;

    public Response(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getTimeStamp() {
        return DateTimeUtil.getDateTime(LocalDateTime.now());
    }
}

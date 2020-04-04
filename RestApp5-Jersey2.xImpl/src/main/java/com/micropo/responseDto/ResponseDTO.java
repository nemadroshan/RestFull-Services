package com.micropo.responseDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    @JsonProperty
    private  byte status;
    @JsonProperty
    private  String message;
    @JsonProperty
    private String data;

    public ResponseDTO() {
        System.out.println("Response DTO : zero Param constructor");
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}

package com.nt.model;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    private int status;
    private String msg,data;

    public ResponseDTO() {
        System.out.println("ResponseDTO : zero param constructor");
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


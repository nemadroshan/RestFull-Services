package com.rn.beans;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
    @XmlElement
    @FormParam("pid")
    private String pid;
    @XmlElement
    @FormParam("pname")
    private String pname;
    @FormParam("mrfDate")
    @XmlElement
    private String mrfDate;
    @FormParam("expDate")
    @XmlElement
    private String expDate;

    @Override
    public String toString() {
        return "Products{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", mrfDate='" + mrfDate + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMrfDate() {
        return mrfDate;
    }

    public void setMrfDate(String mrfDate) {
        this.mrfDate = mrfDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}

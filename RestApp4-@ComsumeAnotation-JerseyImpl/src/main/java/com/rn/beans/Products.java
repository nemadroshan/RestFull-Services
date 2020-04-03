package com.rn.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
    @XmlElement
    private Integer pid;
    @XmlElement
    private String pName;
    public Products() {
        System.out.println("Products Constructor is called");
    }
    public Integer getPid() {
        return pid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    @Override
    public String toString() {
        return "Products{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                '}';
    }
}

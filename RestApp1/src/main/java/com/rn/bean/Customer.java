package com.rn.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Customer")
public class Customer {
    @XmlElement
    private int cid;

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public void setCphNo(String cphNo) {
        this.cphNo = cphNo;
    }

    @XmlElement
    private String cname;
    @XmlElement
    private String cemail;
    @XmlElement
    private String cphNo;




}

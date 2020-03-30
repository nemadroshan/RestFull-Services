package com.nt.beans;

import org.codehaus.jackson.annotate.JsonProperty;

public class Customer {
    @JsonProperty("customer-id")
    private Integer cutomerId;
    @JsonProperty("customer-name")
    private  String customerName;
    @JsonProperty("customer-email")
    private String customerEmail;
    @JsonProperty("customer-phno")
    private String customerPhno;

    public Integer getCutomerId() {
        return cutomerId;
    }

    public void setCutomerId(Integer cutomerId) {
        this.cutomerId = cutomerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhno() {
        return customerPhno;
    }

    public void setCustomerPhno(String customerPhno) {
        this.customerPhno = customerPhno;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cutomerId=" + cutomerId +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhno='" + customerPhno + '\'' +
                '}';
    }
}

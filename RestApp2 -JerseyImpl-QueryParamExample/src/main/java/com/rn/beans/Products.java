package com.rn.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {
    @XmlElement
    private int productId;
    @XmlElement
    private String productName;
    @XmlElement
    private String productMrfDate;
    @XmlElement
    private String productExpDate;

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productMrfDate='" + productMrfDate + '\'' +
                ", productExpDate='" + productExpDate + '\'' +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMrfDate() {
        return productMrfDate;
    }

    public void setProductMrfDate(String productMrfDate) {
        this.productMrfDate = productMrfDate;
    }

    public String getProductExpDate() {
        return productExpDate;
    }

    public void setProductExpDate(String productExpDate) {
        this.productExpDate = productExpDate;
    }


}

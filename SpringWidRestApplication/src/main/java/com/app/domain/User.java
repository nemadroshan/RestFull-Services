package com.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
    @XmlElement
    @JsonProperty
    private String userName;
    @XmlElement
    @JsonProperty
    private Integer userId;
    @XmlElement
    @JsonProperty
    private String gender;
    @XmlElement
    @JsonProperty
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User() {
        System.out.println("User :: 0- Pamram construcotr");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

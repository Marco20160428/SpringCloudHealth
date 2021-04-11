package com.example.userservice.model;

import java.io.Serializable;

public class User implements Serializable {

    public static final long serialVersionUID = 1L;

    private Long id;

    private String userCode;

    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

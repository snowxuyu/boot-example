package com.boot.example.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * date: 2018-1-31 21:56
 * author: snowxuyu
 * describe:
 */
@Data
public class User implements Serializable {
    private Long id;
    private String userName;
    private String password;
    private String phone;
    private String address;
    public User () {

    }

    public User(Long id, String userName, String password, String phone, String address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }
}

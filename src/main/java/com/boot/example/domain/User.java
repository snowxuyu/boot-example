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
    private String passWord;
    private String phone;
    private String address;
    public User () {

    }

    public User(Long id, String userName, String passWord, String phone, String address) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.phone = phone;
        this.address = address;
    }
}

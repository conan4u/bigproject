package com.atguigu.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String name;
    private String password;


    public static void main(String[] args) {
        User user = new User();
        user.setName("conan");
        user.setPassword("123456");
        System.out.println(user);
    }

}

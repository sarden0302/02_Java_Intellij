package com.kh.hw.member.model.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private String id;
    private String name;
    private String password;
    private String email;
    private char gender;
    private int age;

    public Member() {

    }

    public Member(String id, String name, String password, String email, char gender, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String inform() {
        return this.id + " " + this.name + " " + this.password + " " + this.email + " " + this.gender + " " + this.age;
    }
}

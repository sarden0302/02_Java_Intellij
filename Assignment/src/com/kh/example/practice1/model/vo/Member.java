package com.kh.example.practice1.model.vo;

public class Member {
    public String memberId;
    public String memberPwd;
    public String memberName;
    public int age;
    public char gender;
    public String phone;
    public String email;

    public Member(String memberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public void changeName(String newName) {
        this.memberName = newName;
    }

    public void printName() {
        System.out.println(this.memberName);
    }

}

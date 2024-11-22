package com.kh.oop.constructor;

public class Member {
    // field
    private String name;
    private int age;
    private String gender;

    // constructor
    public Member() {
        this.name = "Leo";
        this.age = 19;
        this.gender = "Male";
    }

    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // 세터 게터 이외 기능을 추가할 methods
    // 작성된 정보 불러오기
    // toString 객체에 저장된 내용을 String 형식으로 return 해준다.
    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }


}

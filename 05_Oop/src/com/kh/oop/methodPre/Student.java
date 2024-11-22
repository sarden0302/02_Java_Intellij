package com.kh.oop.methodPre;

//@setter @getter annotation : getter setter 작성 필요 없이 읽어들일 수 있다.
public class Student {
    private String name;
    private int age;
    private String gender;
    private String major;

    //Constructor
    public Student() {
    }

    public Student(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

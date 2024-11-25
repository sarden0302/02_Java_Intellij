package com.kh.oop.constructor;

public class People {
    // 1. field
    private String name;
    private int age;

    // 2. constructor (기본, parameter(part, All))
    public People() {

    }

    // 2-1 모든 값을 넣는 생성자
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 2-2 부분벅으로
    public People(String name) {
        this.name = name;
    }

    public People(int age) {
        this.age = age;
    }

    //method


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

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + '}';
    }
}

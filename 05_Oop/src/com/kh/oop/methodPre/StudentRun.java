package com.kh.oop.methodPre;

public class StudentRun {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("홍길동");
        s.setAge(17);
        s.setGender("남성");
        s.setMajor("컴퓨터공학");

        System.out.println("이름 : " + s.getName() + ", 나이 : " + s.getAge() + ", 성별 : " + s.getGender() + ", 전공 : " + s.getMajor());

    }
}

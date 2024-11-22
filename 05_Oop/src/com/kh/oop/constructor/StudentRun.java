package com.kh.oop.constructor;

public class StudentRun {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("홍길동");
        student1.setAge(21);
        student1.setGender("남성");
        student1.setMajor("컴퓨터공학");
        student1.setGpa(3.8);
        student1.setPhoneNumber("010-2345-6789");
        student1.setEmail("hong123@gmail.com");
        student1.setAddress("서울시");

        Student student2 = new Student("김영희", 22, "여성", "자바공학", 3.9, "010-8765-4321", "kim_young@gmail.com", "경기도");

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println(student1.getMajor());
        System.out.println(student2.getGpa());
    }

}

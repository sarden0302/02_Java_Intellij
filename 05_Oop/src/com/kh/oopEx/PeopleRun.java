package com.kh.oopEx;

public class PeopleRun {
    public static void main(String[] args) {

        People p = new People("홍길동", 800101, 234567890);
        System.out.println(p.toString());
        People p2 = new People("강길자", 500101, 98765432);
        // 생성자시 초기화하는 매개변수가 아닌 추후 설정을 통해 다른 매개변수의 데이터 삽입
        p2.setHobby("음악듣기");
        p2.setSpeciality("코딩");
        System.out.println(p2.toString());

    }
}

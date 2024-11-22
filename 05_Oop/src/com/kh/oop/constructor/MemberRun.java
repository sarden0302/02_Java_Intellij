package com.kh.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {
        // 암호화 설정과 같은 특수 기능을 사용할 때 getter && setter 사용
        Member member1 = new Member();
        member1.setName("홍길동");
        member1.setAge(40);
        member1.setGender("여성");

        // 초기 설정시 사용
        Member member2 = new Member("감길자", 50, "남성");

        System.out.println(member1.toString());
        System.out.println(member2.toString());
    }
}

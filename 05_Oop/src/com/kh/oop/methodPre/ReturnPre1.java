package com.kh.oop.methodPre;

public class ReturnPre1 {
    public String name = "홍길동"; // 이름
    public int phone = 1234;      // 핸드폰번호
    private String id = "dongdong1004"; //아이디

    //이름과 핸드폰 번호가 일치하는 아이디를 전달하기

    public String findId(String a, int b) {
        if (a.equals(this.name) && b == this.phone) {
            return this.id;
        }
        return "조회된 정보가 없습니다.";
    }

    //계산기
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double remainder(double a, double b) {
        return a % b;
    }
}

package com.kh.poly.overloadingEx;

// 메서드(기능)의 이름은 같지만, 매개변수의 개수나 타입이 다를 때 적용
public class 계산기 {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

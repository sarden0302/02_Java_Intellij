package com.kh.poly.overloadingEx;

public class 계산기실행 {
    public static void main(String[] args) {
        계산기 cal = new 계산기();
        System.out.println(cal.add(5, 10));
        System.out.println(cal.add(2.4, 4.8));
        System.out.println(cal.add("한글", "사랑해요"));
        System.out.println(cal.add(2, 4, 8));
    }
}

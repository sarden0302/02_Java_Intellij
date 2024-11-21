package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {
        ReturnPre2 r = new ReturnPre2();
        System.out.println(r.method1("홍길동", 40));
        System.out.println(r.method2(123, 456));
        System.out.println(r.method3(85));
        System.out.println(r.method4(100000, 20));
        System.out.println(r.method5(new int[]{10, 20, 30, 40, 50}));
        System.out.println(r.method6(17));
        System.out.println(r.method7("Hello", "World"));
        System.out.println(r.method8(new String[]{"apple", "banana", "cherry"}, "banana"));
        System.out.println(r.method9(7));
    }
}

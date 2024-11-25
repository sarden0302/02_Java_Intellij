package com.kh.poly.overloadingEx;

public class 오버로딩문제 {
    // 기준
    public void method1(int i) {}

    // 1
    public void method1(String str){}

    // 2
    public void method1(int i, String str){}

    // 3
    public void method1(int num, char c) {}

    // 4 적용 x, 리턴 타입도 같아야 overloading 된다. 매개변수 명과 void 유무는 오버로딩이 되는 조건과 상관 x
    // public char method1(int point){return (char)point;}

    // 5
    public void method1(int i, int k){}

    // 6 2번과 같아서 오버로딩 불가
    // public void method1(int num, String string) {}

    // 7
    public void method1(String str, int i) {}





}

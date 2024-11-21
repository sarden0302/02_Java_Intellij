package com.kh.oop.methodex;

public class Return메서드실행 {
    public static void main(String[] args) {
        Return메서드 r = new Return메서드();
        System.out.println(r.method1());

        /*** 매개변수가 있는 Return 매서드 ***/
        int temp = r.method2("홍길동", 5);
        System.out.println(temp);

        System.out.println(r.plus(2, 3));
    }
}

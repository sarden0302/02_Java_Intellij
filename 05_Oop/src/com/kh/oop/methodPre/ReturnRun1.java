package com.kh.oop.methodPre;

public class ReturnRun1 {
    public static void main(String[] args) {
        ReturnPre1 r = new ReturnPre1();
        //System.out.println(r.findId("감길식", 5678));
        //System.out.println(r.findId("홍길동", 1234));
        System.out.println(r.add(1,2));
        System.out.println(r.subtract(1,2));
        System.out.println(r.multiply(1, 2));
        System.out.println(r.divide(2,1));
        System.out.println(r.remainder(2,1));

        int  x = 3;
        int y = 5;
        System.out.println(r.add(x,y));
        System.out.println(r.subtract(x,y));
        System.out.println(r.multiply(x,y));
        System.out.println(r.divide(x,y));
        System.out.println(r.remainder(x,y));
    }
}

package com.variable.practice;

public class Practice3 {
    public static void main(String[] args) {
        int iNum1 = 10;
        int iNum2 = 4;

        float fNum = 3.0f;
        double dNum = 2.5;
        char ch = 'A';

        System.out.println(iNum1 - 2 * iNum2);
        System.out.println((int)(dNum)); //실수형 정수로 변환시 소수점 버림

        System.out.println(iNum2 * dNum);
        System.out.println((float)iNum1);

        System.out.println((float)iNum1 / (float)iNum2);
        System.out.println(dNum);

        System.out.println((int)fNum);
        System.out.println(iNum1 / (int)fNum);

        System.out.println((float)iNum1 / fNum);
        System.out.println((double)iNum1 / (double)fNum);

        System.out.println(ch);
        System.out.println((int)ch);
        System.out.println((int)ch + iNum1);
        System.out.println((char)((int)ch + iNum1));
    }
}

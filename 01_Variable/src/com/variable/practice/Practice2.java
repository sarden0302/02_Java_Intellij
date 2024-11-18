package com.variable.practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        float kor = sc.nextFloat();
        System.out.print("영어 : ");
        float eng = sc.nextFloat();
        System.out.print("수학 : ");
        float math = sc.nextFloat();

        System.out.print("총점 : " + (int)(kor + eng + math) + "\n평균 : " + (int)(kor + eng + math)/3);

    }
}

package com.kh;

import java.util.Scanner;

public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.printf("취미 입력 : ");
        String hobby = sc.next();
        System.out.println("===== 자기소개 =====\n이름 : " + name + "\n나이 : " + age + "세\n취미 : " + hobby);

    }
}

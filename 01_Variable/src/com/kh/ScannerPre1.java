package com.kh;

import java.util.Scanner;

public class ScannerPre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number3(실수로 입력)");
        float num3 = sc.nextFloat();
        System.out.print("Type  your name : ");
        String name = sc.next();

        System.out.println(num1 + " " + num2 + " " + num3 + " " + name);

        //자동 정렬 단축키
        // Ctrl + Alt + l
    }
}

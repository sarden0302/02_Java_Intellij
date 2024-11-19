package com.variable.practice;

import java.util.Scanner;

public class Practice1 {
    final static int APPLE = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        System.out.println(ch + " unicode : " + (int)ch);
    }
}

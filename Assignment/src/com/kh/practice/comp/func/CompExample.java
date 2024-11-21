package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
    Scanner sc = new Scanner(System.in);
    public void practice1() {
        try {
            System.out.print("정수 : ");
            int claps = sc.nextInt();
            if (claps <= 0) {
                throw new Exception();
            }
            for (int i = 1; i <= claps; i++) {
                if (i % 2 == 1) {
                    System.out.print("박");
                } else {
                    System.out.print("수");
                }
            }
        } catch (Exception e) {
            System.out.println("양수가 아닙니다.");
            practice1();
        }
    }

    public void practice2() {
        try {
            System.out.print("정수 : ");
            int claps = sc.nextInt();
            if (claps <= 0) {
                throw new Exception();
            }
            for (int i = 1; i <= claps; i++) {
                if (i % 2 == 1) {
                    System.out.print("박");
                } else {
                    System.out.print("수");
                }
            }
        } catch (Exception e) {
            System.out.println("양수가 아닙니다.");
            practice2();
        }
    }

    public void practice3() {
        System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for (char s : str.toCharArray()) {
            if (s == ch) {
                count++;
            }
        }
        System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);
    }

    public void practice4() {
        System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        for (char s : str.toCharArray()) {
            if (s == ch) {
                count++;
            }
        }
        System.out.println("포함된 개수 : " + count);
        while(true) {
            System.out.print("더 하시겠습니까? (y/n) : ");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equalsIgnoreCase("y")) {
                practice4();
            }
            if (yesOrNo.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
        }
    }

    public void practice5() {

    }
}

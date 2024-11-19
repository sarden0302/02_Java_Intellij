package com.kh.condition;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConditionEx {
    static Scanner sc = new Scanner(System.in);

    public void checkingAge() {
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Not Adult");
            return;
        }
        System.out.println("Adult");
    }

    public void scannerAge() {
        System.out.println("나이를 확인하기");


        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Not Adult");
            return;
        }
        System.out.println("Adult");
    }

    public void methodAge() {
        System.out.println("나이를 확인하기");

        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
            return;
        }
        if (age >= 13) {
            System.out.println("Childhood");
            return;
        }
        System.out.println("Baby");
    }

    public void methodMonth() {
        System.out.print("날짜를 입력해주세요(1 ~ 12) : ");
        int month = sc.nextInt();
        if (month > 12) {
            System.out.println("1 ~ 12 사이 숫자를 입력해주세요");
            methodMonth();
            return;
        }

        String season = "";
        if (month >= 3 && month < 6) {
            season = "Spring";
        }

        if (month >= 6 && month < 9) {
            System.out.println("Summer");
            return;
        }

        if (month >= 9 && month < 12) {
            System.out.println("Summer");
            return;
        }
        System.out.println("Winter");
    }

    public void switchMonth() {
        System.out.println("계절을 확인하기");

        int month = sc.nextInt();
        String season = "";

        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
        }
        System.out.println(season);
    }
}

package com.kh.CollectionEx.conditionLoopEx;

import java.util.Scanner;

public class SwitchEx {
    /*
        switch 하나의 변수나 값을 여러 케이스로 나눠 조건에 따라 조건에서 원하는
        기능을 실행
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호를 입력하세요 : ");
        int abc = Integer.parseInt(sc.nextLine());

        switch (abc) {
            case 1:
                System.out.println("1 번 기능 실행");
                break;
            case 2:
                System.out.println("2 번 기능 실행");
                break;
            default:
                System.out.println("1번과 2번이 아닐시");
                break;
        }
    }
}

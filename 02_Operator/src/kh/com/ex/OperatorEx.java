package kh.com.ex;

import java.util.Scanner;

// 사칙연산 기능만 들어있는 클래스
public class OperatorEx {
    static Scanner sc = new Scanner(System.in);
    public void checkingThreeMultiply() {

        System.out.print("숫자 하나를 입력하세요 : ");

        int num = sc.nextInt();

        System.out.println("3의 배수? "+(num % 3 == 0));
    }

    public void checkingTwoMultiply() {
        System.out.print("숫자 하나를 입력하세요 : ");

        int num = sc.nextInt();

        System.out.println("2의 배수? "+(num % 2 == 0));
    }
}

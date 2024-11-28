package com.kh.exceptionPre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            //스캐너로 숫자를 입력받고 나누기에 대한 결과 확인
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = Integer.parseInt(sc.nextLine());

            int divisionResult = num1 / num2;
            System.out.println("나누기 결과 : " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생 : " + e);
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
            System.out.println("프로그램을 종료합니다.");
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력");
            System.out.println("프로그램을 종료합니다.");

        } catch (Exception e) {
            System.out.println("예기치 못한 문제가 발생했습니다.");
            System.out.println("프로그램을 종료합니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
            sc.close();
        }

    }
}

package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== 게임 캐릭터 정보 입력 ===");
            System.out.print("닉네임 : ");
            String nickname = sc.nextLine();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            System.out.print("나이 : ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("게임 캐릭터가 성공적으로 만들어졌습니다.");
            System.out.print("캐릭터 정보 : " + nickname + " , 성별 : " + gender + ", 나이 : " + age);
        } catch (NumberFormatException e) {
            e.printStackTrace();

            System.out.println("캐릭터를 만드는 도중 문제가 발생했습니다.");
        } finally {
            sc.close();
            System.out.println("게임을 종료합니다.");
        }

        try {
            int a = 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

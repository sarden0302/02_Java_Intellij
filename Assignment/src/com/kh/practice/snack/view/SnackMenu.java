package com.kh.practice.snack.view;

import com.kh.practice.snack.controller.SnackController;

import java.util.Scanner;

public class SnackMenu {
    Scanner sc = new Scanner(System.in);
    SnackController scr = new SnackController();

    public void menu() {
        try {
            System.out.println("스낵류를 입력하세요");
            System.out.print("종류 : ");
            String kind = sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("맛 : ");
            String flavor = sc.nextLine();
            System.out.print("개수: ");
            int numOf = Integer.parseInt(sc.nextLine());
            System.out.print("가격 : ");
            int price = Integer.parseInt(sc.nextLine());

            scr.saveData(kind, name, flavor, numOf, price);
            String answer = "";
            while (!answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("no")) {
                System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
                answer = sc.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println(scr.confirmData());
                    return;
                }
                if (answer.equalsIgnoreCase("n")) {
                    return;
                }
                System.out.println("y/n 중에 입력해주세요.");
            }


        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력 방식입니다. 다시 작성해주세요.");
            menu();
        }
    }

    public static void main(String[] args) {

    }

}

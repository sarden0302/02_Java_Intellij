package com.kh.hw.shape.view;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

import java.util.Scanner;

public class ShapeMenu {
    Scanner sc = new Scanner(System.in);
    SquareController scr = new SquareController();
    TriangleController tc = new TriangleController();

    public void inputMenu() {
        try {
            System.out.println("===== 도형 프로그램 =====");
            System.out.println("3. 삼각형");
            System.out.println("4. 사각형");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호 : ");
            int inputNumber = Integer.parseInt(sc.nextLine());
            if (inputNumber != 3 && inputNumber != 4 && inputNumber != 9) {
                throw new NumberFormatException();
            }

            if (inputNumber == 3) {
                triangleMenu();
            }

            if (inputNumber == 4) {
                squareMenu();
            }

            if (inputNumber == 9) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("잘못된 번호입니다. 다시 입력하세요.");
            inputMenu();
        }

    }

    public void triangleMenu() {
        try {
            System.out.println("===== 삼각형 =====");
            System.out.println("1. 삼각형 둘레");
            System.out.println("2. 삼각형 면적");
            System.out.println("3. 삼각형 색칠");
            System.out.println("4. 삼각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int inputNumber = Integer.parseInt(sc.nextLine());
            
            if (inputNumber != 1 && inputNumber != 2 && inputNumber != 3 && inputNumber != 4 && inputNumber != 9) {
                throw new NumberFormatException();
            }

            if (inputNumber == 1) {
                System.out.print("높이 : ");
                int height = Integer.parseInt(sc.nextLine());
                System.out.print("너비 : ");
                int width = Integer.parseInt(sc.nextLine());

                System.out.println("삼각형 둘레 : " + scr.calcPerimeter(height, width));
                triangleMenu();
            }

            if (inputNumber == 2) {
                System.out.print("높이");
                int height = Integer.parseInt(sc.nextLine());
                System.out.print("너비");
                int width = Integer.parseInt(sc.nextLine());

                System.out.println("삼각형 면적 : " + scr.calcArea(height, width));
                triangleMenu();
            }

            if (inputNumber == 3) {
                System.out.print("색깔을 입력하세요 : ");
                String color = sc.nextLine();
                scr.paintColor(color);
                System.out.println("색이 수정되었습니다.");
                triangleMenu();
            }

            if (inputNumber == 4) {
                System.out.println(scr.print());
                triangleMenu();
            }

            if (inputNumber == 9) {
                inputMenu();
            }
            
        } catch (NumberFormatException e) {
            System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            triangleMenu();
        }

    }

    public void squareMenu() {
        try {
            System.out.println("===== 삼각형 =====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 면적");
            System.out.println("3. 사각형 색칠");
            System.out.println("4. 사각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int inputNumber = Integer.parseInt(sc.nextLine());

            if (inputNumber != 1 && inputNumber != 2 && inputNumber != 3 && inputNumber != 4 && inputNumber != 9) {
                throw new NumberFormatException();
            }

            if (inputNumber == 1) {
                System.out.print("높이");
                int height = Integer.parseInt(sc.nextLine());
                System.out.print("너비");
                int width = Integer.parseInt(sc.nextLine());

                System.out.println("사각형 둘레 : " + tc.calcPerimeter(height, width));
                squareMenu();
            }

            if (inputNumber == 2) {
                System.out.print("높이");
                int height = Integer.parseInt(sc.nextLine());
                System.out.print("너비");
                int width = Integer.parseInt(sc.nextLine());

                System.out.println("사각형 면적 : " + tc.calcArea(height, width));
                squareMenu();
            }

            if (inputNumber == 3) {
                System.out.print("색깔을 입력하세요 : ");
                String color = sc.nextLine();
                tc.paintColor(color);
                System.out.println("색이 수정되었습니다.");
                squareMenu();
            }

            if (inputNumber == 4) {
                System.out.println(tc.print());
                squareMenu();
            }

            if (inputNumber == 9) {
                inputMenu();
            }

        } catch (NumberFormatException e) {
            System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            triangleMenu();
        }

    }

    public void inputSize(int type, int menuNum) {

    }

    public void pringInformation(int type) {

    }
}

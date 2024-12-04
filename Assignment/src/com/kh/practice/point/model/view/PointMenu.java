package com.kh.practice.point.model.view;

import com.kh.practice.point.model.controller.CircleController;
import com.kh.practice.point.model.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static CircleController cc = new CircleController();
    private static RectangleController rc = new RectangleController();

    public static void main(String[] args) {
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 원");
        System.out.println("2. 사각형");
        System.out.println("9. 끝내기");
        boolean isTrue = true;
        try {
            while (isTrue) {
                System.out.print("메뉴 번호 : ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        circleMenu();
                        break;
                    case 2:
                        rectangleMenu();
                        break;
                    case 9:
                        isTrue = false;
                        break;
                    default:
                        System.out.println("1, 2, 9 중에서 작성해주세요.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("종료합니다.");
        } finally {
            System.out.println("종료합니다.");
        }

    }

    public static void circleMenu() {
        System.out.println("===== 원 메뉴 =====");
        System.out.println("1. 원 둘레");
        System.out.println("2. 원 넓이");
        System.out.println("9. 메인으로");
        System.out.print("메뉴 번호 : ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    calcCircum();
                    break;
                case 2:
                    calcCircleArea();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("1, 2, 9 중에서 작성해주세요.");
            }
        } catch (NumberFormatException e) {
            System.out.println("1, 2, 9 중에서 작성해주세요.");
        }
    }

    public static void rectangleMenu() {
        System.out.println("===== 사각형 메뉴 =====");
        System.out.println("1. 사각형 둘레");
        System.out.println("2. 사각형 넓이");
        System.out.println("9. 끝내기");
        System.out.print("메뉴 번호 : ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    calcPerimeter();
                    break;
                case 2:
                    calcRectArea();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("1, 2, 9 중에서 작성해주세요.");
            }
        } catch (NumberFormatException e) {
            System.out.println("1, 2, 9 중에서 작성해주세요.");
        }
    }

    public static void calcCircum() {
        try {
            System.out.print("x 좌표 : ");
            Integer x = Integer.parseInt(scanner.nextLine());
            System.out.print("y 좌표 : ");
            Integer y = Integer.parseInt(scanner.nextLine());
            System.out.print("반지름 : ");
            Integer radius = Integer.parseInt(scanner.nextLine());
            System.out.println("둘레 : " + x + ", " + y + ", " + radius + " / " + cc.calcCircum(x, y, radius));
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다. 메인화면으로 돌아갑니다.");
        }


    }

    public static void calcCircleArea() {
        try {
            System.out.print("x 좌표 : ");
            Integer x = Integer.parseInt(scanner.nextLine());
            System.out.print("y 좌표 : ");
            Integer y = Integer.parseInt(scanner.nextLine());
            System.out.print("반지름 : ");
            Integer radius = Integer.parseInt(scanner.nextLine());
            System.out.println("둘레 : " + x + ", " + y + ", " + radius + " / " + cc.calcArea(x, y, radius));
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다. 메인화면으로 돌아갑니다.");
        }
    }

    public static void calcPerimeter() {
        try {
            System.out.print("x 좌표 : ");
            Integer x = Integer.parseInt(scanner.nextLine());
            System.out.print("y 좌표 : ");
            Integer y = Integer.parseInt(scanner.nextLine());
            System.out.print("높이 : ");
            Integer height = Integer.parseInt(scanner.nextLine());
            System.out.print("넓이 : ");
            Integer width = Integer.parseInt(scanner.nextLine());
            System.out.println("넓이 : " + x + ", " + y + ", " + height + ", " + width + " / " + rc.calcPerimeter(x, y, height, width));
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다. 메인화면으로 돌아갑니다.");
        }
    }

    public static void calcRectArea() {
        try {
            System.out.print("x 좌표 : ");
            Integer x = Integer.parseInt(scanner.nextLine());
            System.out.print("y 좌표 : ");
            Integer y = Integer.parseInt(scanner.nextLine());
            System.out.print("높이 : ");
            Integer height = Integer.parseInt(scanner.nextLine());
            System.out.print("넓이 : ");
            Integer width = Integer.parseInt(scanner.nextLine());
            System.out.println("넓이 : " + x + ", " + y + ", " + height + ", " + width + " / " + rc.calcArea(x, y, height, width));
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다. 메인화면으로 돌아갑니다.");
        }
    }
}

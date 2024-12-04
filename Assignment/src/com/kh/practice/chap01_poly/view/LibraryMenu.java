package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryController lc;
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별 : ");
        char gender = sc.nextLine().charAt(0);

        lc.insertMember(new Member(name, age, gender));

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("메뉴 번호 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    lc.myInfo();
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("보기에 없는 목록입니다. 다시 작성해주세요.");
                    break;
            }
        }
    }

    public void selectAll() {

    }

    public void searchBook() {

    }

    public void rentBook() {

    }

}

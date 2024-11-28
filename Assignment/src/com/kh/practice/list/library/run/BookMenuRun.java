package com.kh.practice.list.library.run;

import com.kh.practice.list.library.view.BookMenu;

import java.util.Scanner;

public class BookMenuRun {

    static Scanner sc = new Scanner(System.in);
    static BookMenu bookMenu = new BookMenu();
    public static void main(String[] args) {
        System.out.println("===== Welcome KH Library =====");
        boolean isTrue = true;
        while (isTrue) {
            isTrue = mainMenu();
        }

    }

    public static boolean mainMenu() {
        try {
            System.out.println("\n=====***** 메인 메뉴 *****=====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 정렬");
            System.out.println("9. 종료\n");
            System.out.print("메뉴 번호 입력 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    bookMenu.insertBook();
                    return true;
                case 2:
                    bookMenu.selectList();
                    return true;
                case 3:
                    bookMenu.selectBook();
                    return true;
                case 4:
                    bookMenu.deleteBook();
                    return true;
                case 5:
                    bookMenu.ascBook();
                    return true;
                case 9:
                    return false;
                default:
                    System.out.println("1, 2, 3, 4, 5, 9 중에 작성해 주세요");
                    return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력 방식입니다 다시 작성해주세요.");
            return mainMenu();
        }
    }
}

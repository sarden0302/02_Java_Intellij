package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class BookServiceRun {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        //bookService.method2();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 책 매니저 ===");
            System.out.println("1. 책 추가하기");
            System.out.println("2. 책 제거하기");
            System.out.println("3. 모든 책 리스트 확인하기");
            System.out.println("4. 종료");
            System.out.print("번호만 입력하세요 : ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 :
                    System.out.print("책 제목을 입력하세요 : ");
                    String title = scanner.nextLine();
                    System.out.print("저자를 입력하세요 : ");
                    String author = scanner.nextLine();
                    System.out.print("팔고자 하는 가격을 입력하세요 : ");
                    int price = Integer.parseInt(scanner.nextLine());
                    // 책 저장하기 기능 -> BookService
                    bookService.addBook(title, author, price);
                    break;

                case 2 :
                    System.out.print("지우고자 하는 책의 제목을 입력하세요 : ");
                    String removeTitle = scanner.nextLine();
                    // 책 찾았다 or 못찾았다 if 문
                    bookService.removeBook(removeTitle);
                    break;

                case 3 :
                    // 책 리스트를 모두 보는 곳
                    // 만약에 책이 하나도 없다면
                    // 판매할 수 있는 책 리스트가 없습니다.
                    System.out.println(bookService.getBookList());
                    break;

                case 4 :
                    System.out.println("책 매니저를 종료합니다. 안녕~");
                    return;

                default :
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}

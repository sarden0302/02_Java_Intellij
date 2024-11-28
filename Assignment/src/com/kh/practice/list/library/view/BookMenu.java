package com.kh.practice.list.library.view;

import com.kh.practice.list.library.model.dto.Book;
import com.kh.practice.list.library.model.dto.SortByTitle;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    @Getter
    private List<Book> list = new ArrayList<>();

    public void insertBook() {
        System.out.println("===== 새 도서 추가 =====");
        System.out.println("책 정보를 입력해주세요.");
        System.out.print("도서 명 : ");
        String title = sc.nextLine();
        System.out.print("저자 명 : ");
        String author = sc.nextLine();
        try {
            System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
            int category = Integer.parseInt(sc.nextLine());
            if (category <= 0 || category > 4) {
                throw new NumberFormatException();
            }
            System.out.print("가격 : ");
            int price = Integer.parseInt(sc.nextLine());
            list.add(new Book(title, author, category, price));

        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            insertBook();
        }

    }

    public void selectList() {
        if (list.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
            return;
        }
        System.out.println("===== 도서 전체 조회 =====");
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }

    public void selectBook() {
        if (list.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        boolean found = false;

        System.out.println("===== 도서 검색 =====");
        System.out.print("검색 키워드 : ");
        String search = sc.nextLine();
        for (Book book : list) {
            if (book.getTitle().contains(search)) {
                found = true;
                System.out.println(book.toString());
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void deleteBook() {
        if (list.isEmpty()) {
            System.out.println("현재 도서 목록은 비어있습니다.");
            return;
        }
        System.out.println("===== 도서 삭제 =====");
        System.out.print("삭제할 도서 명 : ");
        String deleteTitle = sc.nextLine();
        System.out.print("삭제할 저자 명 : ");
        String deleteAuthor = sc.nextLine();
        for (Book book : list) {
            if (book.getTitle().equals(deleteTitle) && book.getAuthor().equals(deleteAuthor)) {
                list.remove(book);
                System.out.println("성공적으로 삭제되었습니다.");
                return;
            }
        }
        System.out.println("삭제할 도서를 찾지 못했습니다.");
    }

    public void ascBook() {
        if (list.isEmpty()) {
            System.out.println("목록이 없어서 정렬할 수 없습니다.");
            return;
        }
        /* Stream 사용
        list = list.stream().sorted(Comparator.comparing(Book::getTitle)).collect(Collectors.toList()); */

        /* Interface 구현 후 적용
        list.sort(new SortByTitle()); */

        /* 익명 함수로 interface 구현 후 적용
        list.sort ( new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        }); */

        /* 람다식 사용
        list.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle())); */

    }


}

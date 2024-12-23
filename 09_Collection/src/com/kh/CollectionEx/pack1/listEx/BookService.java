package com.kh.CollectionEx.pack1.listEx;

// Collection Framework
// java.util API

import java.lang.reflect.Array;
import java.util.ArrayList;

// 특징
// 1) 크기 제한 없음
// 2) 추가 수정 삭제 검색
public class BookService {
    // List : 자료를 순차적으로 나열한 자료 구조
    //  - 인덱스가 존재함
    //      -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능

    /* List 사용해보기 */
    public void method1() {
        // List 객체 생성

        int arr1[] = new int[3];
        String arr2[] = new String[3];

        arr1[0] = 10;


        ArrayList list1 = new ArrayList(3); //

        list1.add(1);
        list1.add("아무거나 넣을 수 있어요."); //알아서 자동으로 index 1번째 자리에 문자열
        list1.add(123);
        list1.add(false); // 3칸으로 되어있는 ArrayList 가 4칸으로 자동 크기 변경

        System.out.println(list1);

        // size : list에 저장된 요소(객체)의 개수
        System.out.println(list1.size());
    }

    // ArrayList 자료형 제한 설정하기
    //
    public void method2() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("닭갈비");
        list1.add("치킨");
        list1.add("보쌈");
        // list1.add(1123);

        list1.add("족발");

        System.out.println(list1);
        System.out.println(list1.size());
    }

    private ArrayList<Book> bookList = new ArrayList<>();

    // 책 추가 기능
    public void addBook(String title, String author, int price) {
        bookList.add(new Book(title, author, price));
        System.out.println(bookList);
        System.out.println("책이 성공적으로 추가되었습니다.");
    }

    public void removeBook(String title) {

        boolean found = false;

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                bookList.remove(i);
                System.out.println("책이 성공적으로 삭제되었습니다 : " + title);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 제목의 책을 찾을 수 없습니다. : " + title);
        }

    }

    //저정된 책 모두 확인하기
    public ArrayList<Book> getBookList() {
        return bookList;
    }




}

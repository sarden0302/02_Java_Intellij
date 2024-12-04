package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.ArrayList;

public class LibraryController {
    private Member mem;
    private Book[] bList = {
            new CookBook("백종원의 집밥", "백종원", "tvN", true),
            new AniBook("한번 더 해요", "미티", "원모어", 19),
            new AniBook("루피의 원피스", "루피", "japan", 12),
            new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false),
            new CookBook("최현석 날 따라해봐", "최현석", "소금책", true)
    };


    public void insertMember(Member member) {
        mem = member;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        for (Book book : bList) {
            if (book.getTitle().contains(keyword)) {
                bookList.add(book);
            }
        }

        return bookList.toArray(new Book[bookList.size()]);
    }

    public int rentBook(int index) {
        if (bList[index] != null) {
            return 0;
        }
        if (bList[index] instanceof AniBook) {
            return (((AniBook) bList[index]).getAccessAge() > mem.getAge()) ? 1 : 0;
        }
        if (bList[index] instanceof CookBook) {
            if (((CookBook)bList[index]).getCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                return 2;
            }
        }
        return 0;
    }

}

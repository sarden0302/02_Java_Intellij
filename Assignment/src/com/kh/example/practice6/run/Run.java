package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

    public static void main(String[] args) {
        Book book1 = new Book("t", "p", "a");
        Book book2 = new Book("tt", "pp", "aa", 5000, 20);
        book1.inform();
        book2.inform();
    }
}

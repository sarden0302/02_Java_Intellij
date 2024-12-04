package com.kh.practice.chap01_poly.model.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title +
                ", author='" + author +
                ", publisher='" + publisher + ']';
    }

}

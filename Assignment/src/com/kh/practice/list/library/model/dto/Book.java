package com.kh.practice.list.library.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book(String title, String author, int category, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        if (category == 1) {
            this.category = "인문";
            return;
        }
        if (category == 2) {
            this.category = "과학";
            return;
        }
        if (category == 3) {
            this.category = "외국어";
            return;
        }
        if (category == 4) {
            this.category = "기타";
            return;
        }
    }

    @Override
    public String toString() {
        return "\t(" + title + "/" + author + "/" + category + "/" + price + ")";
    }

}


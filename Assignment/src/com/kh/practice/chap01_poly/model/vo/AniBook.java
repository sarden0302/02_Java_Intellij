package com.kh.practice.chap01_poly.model.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AniBook extends Book {
    private int accessAge;

    public AniBook() {
        super("", "", "");
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return "AniBook[" + super.toString() + ", accessAge=" + accessAge + "]";
    }
}

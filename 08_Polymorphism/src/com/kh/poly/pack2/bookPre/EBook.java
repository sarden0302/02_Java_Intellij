package com.kh.poly.pack2.bookPre;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EBook extends Book {
    private String fileSize;

    public EBook() {
        super();
    }

    public EBook(String title, String author, int price, String fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "fileSize='" + fileSize + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                "원}";
    }
}

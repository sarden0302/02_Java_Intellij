package com.kh.poly.pack2.bookPre;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class PrintBook extends Book {
    private int shippingCost;

    public PrintBook() {
        super();
    }

    public PrintBook(String title, String author, int price, int shippingCost) {
        super(title, author, price);
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "PrintBook{" +
                "shippingCost=" + shippingCost +
                "원, title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                "원}";
    }
}

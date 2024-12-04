package com.kh.practice.chap01_poly.model.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CookBook extends Book {
    private boolean coupon;
    public CookBook() {
        super("", "", "");
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook [" + super.toString() + ", coupon=" + coupon + "]";
    }

    public boolean getCoupon() {
        return coupon;
    }
}

package com.kh.poly.pack2.maver;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class 메이버쇼핑 extends 메이버회원{
    private int 결제횟수;
    private String 등급;
    private int point;

    public 메이버쇼핑(String 유저이름, String 유저번호, String 유저주소, String 유저나이, int 결제횟수, String 등급, int point) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.결제횟수 = 결제횟수;
        this.등급 = 등급;
        this.point = point;
    }

    @Override
    public String toString() {
        return  "메이버쇼핑{" +
                super.toString() + '\'' +
                "결제횟수=" + 결제횟수 +
                ", 등급='" + 등급 + '\'' +
                ", point=" + point +
                '}';
    }
}

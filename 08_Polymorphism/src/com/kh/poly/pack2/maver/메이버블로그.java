package com.kh.poly.pack2.maver;

import lombok.*;

@Getter @Setter
public class 메이버블로그 extends 메이버회원{
    private String 블로그닉네임;
    private String 블로그제목;

    public 메이버블로그() {
        super();
    }

    public 메이버블로그(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String 블로그닉네임, String 블로그제목) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.블로그닉네임 = 블로그닉네임;
        this.블로그제목 = 블로그제목;
    }

    @Override
    public String toString() {
        return "메이버블로그{" +
                super.toString() + '\'' +
                "블로그닉네임='" + 블로그닉네임 + '\'' +
                ", 블로그제목='" + 블로그제목 + '\'' +
                '}';
    }
}

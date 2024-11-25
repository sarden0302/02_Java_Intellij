package com.kh.poly.pack2.maver;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class 메이버회원 {
    private String 유저이름;
    private String 유저번호;
    private String 유저주소;
    private String 유저나이;

    // 기본 생성자

    public 메이버회원() {
    }

    public 메이버회원(String 유저이름, String 유저번호, String 유저주소, String 유저나이) {
        this.유저이름 = 유저이름;
        this.유저번호 = 유저번호;
        this.유저주소 = 유저주소;
        this.유저나이 = 유저나이;
    }
}

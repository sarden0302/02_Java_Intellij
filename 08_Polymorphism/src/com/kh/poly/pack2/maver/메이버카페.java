package com.kh.poly.pack2.maver;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class 메이버카페 extends 메이버회원{
    private String 카페권한;
    private String 가입카페명;

    public 메이버카페(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String 카페권한, String 가입카페명) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.카페권한 = 카페권한;
        this.가입카페명 = 가입카페명;
    }

    @Override
    public String toString() {
        return  "메이버카페{" +
                super.toString() + '\'' +
                "카페권한='" + 카페권한 + '\'' +
                ", 가입카페명='" + 가입카페명 + '\'' +
                '}';
    }
}

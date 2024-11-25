package com.kh.poly.pack1.dto.service;

import lombok.*;

@Getter @Setter @NoArgsConstructor
public class 갤럭시 extends 스마트폰{
    private int 안드로이드버전;

    public 갤럭시(String 화면, String 통신사, String 성능, int 안드로이드버전) {
        super(화면, 통신사, 성능);
        this.안드로이드버전 = 안드로이드버전;
    }

    @Override
    public String toString() {
        return "갤럭시{" +
                "안드로이드버전=" + 안드로이드버전 + super.toString() +
                '}';
    }
}

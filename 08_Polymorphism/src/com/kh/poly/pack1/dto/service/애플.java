package com.kh.poly.pack1.dto.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class 애플 extends 스마트폰{
    private int ios버전;

    public 애플(String 화면, String 통신사, String 성능, int ios버전) {
        super(화면, 통신사, 성능);
        this.ios버전 = ios버전;
    }

    @Override
    public String toString() {
        return "갤럭시{" +
                "ios버전=" + ios버전 + super.toString() +
                '}';
    }
}

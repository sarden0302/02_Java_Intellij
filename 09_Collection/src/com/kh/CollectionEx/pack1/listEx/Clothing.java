package com.kh.CollectionEx.pack1.listEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clothing {
    private String name;
    private String category;
    private String price;


    @Override
    public String toString() {
        return "옷 이름 : " + name + ", 카테고리 : " + category + ", 옷 가격 : " + price + "원";
    }
}

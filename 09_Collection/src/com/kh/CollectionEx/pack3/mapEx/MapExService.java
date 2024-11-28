package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;

public class MapExService {
    public void method1() {
        HashMap<Integer, String> subway = new HashMap<>();
        int count = 1;

        subway.put(count++, "에그마요");
        subway.put(count++, "로티세리바베큐");
        subway.put(count++, "스테이크앤치즈");
        subway.put(count++, "스파이시쉬림프");

        System.out.println("서브웨이 샌드위치 번호와 메뉴명 확인 : " + subway);

    }
}

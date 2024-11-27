package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre2 {
    // method1 : 정수형 출력
    public void method1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("정수형 리스트 초기값 : " + list);
        //삭제 remove("값") remove(int indexNumber)
        list.remove(Integer.valueOf(30));
    }

    // method2 : 실수형 출력


}

package com.kh.service;

import com.kh.dto.과자;

public class 과자추가기능 {
    private 과자[] snacks;
    /*{{"썬칩", 2000, "매콤한맛"}, {"고래밥", 1000, "고소한맛"}, {"포카칩", 1500, "생감자맛"}};*/
    private int count;

    // 필수 생성자, 과자 최대 개수 지정
    public 과자추가기능(int maxSnacks) {
        this.snacks = new 과자[maxSnacks]; // 과자 최대 갯수 넣겠다
        this.count = 0;
    }

    public boolean addSnack(String name, int price, String flavor) {
        if (count < snacks.length) {
            snacks[count++] = new 과자(name, price, flavor);
            return true;
        }
        return false;
    }

    // 과자 배열 반환
    public 과자[] getSnacks() {
        return snacks;
    }

    // 저장된 과자 개수 반환
    public int getCount() {
        return count;
    }
}

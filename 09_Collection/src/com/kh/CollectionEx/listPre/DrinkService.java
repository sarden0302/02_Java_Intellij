package com.kh.CollectionEx.listPre;

import java.util.ArrayList;

public class DrinkService {
    // 1. Drink 객체 d
    public ArrayList<Drink> d = new ArrayList<>();

    // 2. Drink 음료 이름 가격 추가
    public void addDrink(Drink d) {
        for (Drink drink : this.d) {
            if (drink.equals(d)) {
                System.out.println("현재 목록에 있는 음료입니다. 중복 허용 x");
                return;
            }
        }
        this.d.add(d);
        System.out.println(d.getName() + " 이(가) 성공적으로 추가되었습니다.");


    }

    // 3. Drink 음료 이름 가격 모두 조회
    public void allDrinks() {
        if (this.d.isEmpty()) {
            System.out.println("현재 음료 데이터는 초기화 상태입니다.");
            return;
        }

        for (Drink d : this.d) {
            System.out.println(d.toString());
        }
    }

    // 4. Drink 음료 특정 음료 삭제
    public void removeDrink(String name) {
        if (this.d.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).getName().equals(name)) {
                this.d.remove(i);
                System.out.println("음료를 삭제했습니다.");
                return;
            }
        }
    }

    // 5. Drink 음료 특정 음료 검색
    public void searchDrink(String name) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).getName().equals(name)) {
                System.out.println(this.d.get(i).toString());
                return;
            }
        }
        System.out.println("상품명과 일치하는 음료가 없습니다.");
    }

    // 6. Drink 음료 가격 검색
    public void searchDrink(int price) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).getPrice() == price) {
                System.out.println(this.d.get(i).toString());
                return;
            }
        }
        System.out.println("상품명과 일치하는 음료가 없습니다.");
    }
}

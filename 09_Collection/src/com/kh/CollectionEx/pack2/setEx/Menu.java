package com.kh.CollectionEx.pack2.setEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor@AllArgsConstructor
@Getter
@Setter
public class Menu {
    private int id;         // menu 순서
    private String name;    // menu 이름
    private double price;   // menu 가격

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // equals hashCode
    // equals : 두 객체의 value가 같은지 비교       (얕은 비교) / 동등
    // hashCode : 두 객체의 reference가 같은지 비교 (깊은 비교) / 동일




    @Override
    public boolean equals(Object o) {
        // 객체 타입이 맞은지 확인
        if (!(o instanceof Menu menu)) return false;
        return id == menu.id && Double.compare(price, menu.price) == 0 && Objects.equals(name, menu.name);
        // Double.compare(price, menu.price)
        // 같으면 0, 왼쪽이 크면 양수, 오른쪽이 크면 음수
        // 2 = 2 ==== 0,    2 = 4 ==== -2      2 = 1 ===== 1
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}

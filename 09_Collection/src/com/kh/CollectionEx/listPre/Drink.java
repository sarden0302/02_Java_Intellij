package com.kh.CollectionEx.listPre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Drink {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "음료 이름 = " + name + ", 음료 가격 = " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Drink drink)) return false;
        return price == drink.price && Objects.equals(name, drink.name);
    }
}

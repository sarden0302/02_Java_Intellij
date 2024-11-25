package com.kh.poly.pack2.animalPre;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public class Cat extends Animal {
    private String 색상;
    private int 펀치횟수;

    public Cat(String name, int age, String 색상, int 펀치횟수) {
        super(name, age);
        this.색상 = 색상;
        this.펀치횟수 = 펀치횟수;
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.toString() +
                "색상='" + 색상 + '\'' +
                ", 펀치횟수=" + 펀치횟수 +
                '}';
    }
}

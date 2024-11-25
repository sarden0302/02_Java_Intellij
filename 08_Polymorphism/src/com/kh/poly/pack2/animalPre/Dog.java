package com.kh.poly.pack2.animalPre;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public class Dog extends Animal {
    private String 품종;
    private int 산책횟수;


    public Dog(String name, int age, String 품종, int 산책횟수) {
        super(name, age);
        this.품종 = 품종;
        this.산책횟수 = 산책횟수;
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                "품종='" + 품종 + '\'' +
                ", 산책횟수=" + 산책횟수 +
                '}';
    }
}

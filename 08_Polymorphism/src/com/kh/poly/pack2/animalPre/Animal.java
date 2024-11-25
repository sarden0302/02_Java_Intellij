package com.kh.poly.pack2.animalPre;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter
@Setter  @NoArgsConstructor
public class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

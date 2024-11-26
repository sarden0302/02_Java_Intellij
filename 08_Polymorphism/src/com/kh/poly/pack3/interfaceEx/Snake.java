package com.kh.poly.pack3.interfaceEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Snake extends Animal{
    private int poison;

    @Override
    public void eat() {
        System.out.println("뱀은 한 번에 삼켜서 천천히 소화시킴");
    }

    @Override
    public void sleep() {
        System.out.println("뱀은 똬리를 틀고 잠을 잔다.");
    }

    @Override
    public String toString(){
        return super.toString() + ", poison : " + poison;
    }
}

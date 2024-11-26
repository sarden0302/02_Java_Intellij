package com.kh.poly.pack3.interfacePre;

// extends 는 하나만 상속 가능
// 강제로 기능 구현해야되는 엄마 & 아빠의 기능도 상속 받겠다.
public class 자식 extends 엄마 implements 아빠 {
    @Override
    public void 책읽기() {
        System.out.println("자식은 책을 읽습니다");
    }

    @Override
    public void 스포츠활동() {
        System.out.println("자식은 스포츠활동을 합니다.");
    }

    @Override
    public void 예의() {
        System.out.println("자식은 어머니에게 예의를 배웁니다.");
    }
}

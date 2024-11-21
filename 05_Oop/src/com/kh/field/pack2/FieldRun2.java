package com.kh.field.pack2;

import com.kh.field.pack1.FieldEx1;

/*
    proteced field를 상속하더라도 static main 기능이 바로 올라올 순 없음
    public void method(), public return method()

 */

public class FieldRun2 extends FieldEx1 {

    public static void main(String[] args) {
        FieldEx1 f1 = new FieldEx1();

        System.out.println(f1.퍼블릭);
        //다른 패키지에선 protected, default, private 접근 불가능
    }

    public void method() {
        System.out.println(프로택티드);
    }
}

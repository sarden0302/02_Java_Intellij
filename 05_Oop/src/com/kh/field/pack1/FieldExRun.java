package com.kh.field.pack1;

public class FieldExRun {
    public static void main(String[] args) {
        FieldEx1 fieldExRun = new FieldEx1();
        fieldExRun.method1();

        System.out.println(fieldExRun.퍼블릭);
        System.out.println(fieldExRun.프로택티드);
        System.out.println(fieldExRun.디폴트);
        //private field는 밖 클래스에선 직접 부를 수 없다.
    }
}

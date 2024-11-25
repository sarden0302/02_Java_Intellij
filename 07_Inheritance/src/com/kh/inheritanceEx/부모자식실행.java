package com.kh.inheritanceEx;

public class 부모자식실행 {
    public static void main(String[] args) {
        자식 자식1 = new 자식();
        자식1.set돈(50000000);
        자식1.set차("아반떼");
        자식1.set취미("요트타기");
        System.out.println(자식1.toString());
    }
}

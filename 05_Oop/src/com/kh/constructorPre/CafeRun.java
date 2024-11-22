package com.kh.constructorPre;

import java.util.Scanner;

public class CafeRun {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("이름을 작성해주세요 : ");
        String name = sc.nextLine();
        System.out.print("가격을 작성해주세요 : ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("수량을 작성해주세요 : ");
        int quantity = Integer.parseInt(sc.nextLine());

        Cafe cafe = new Cafe(name, price, quantity);
        System.out.println("주문 총액 : " + cafe.totalPrice());
        System.out.println(cafe.toString());

    }
}

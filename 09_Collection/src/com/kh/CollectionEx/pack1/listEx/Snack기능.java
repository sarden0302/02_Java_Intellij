package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {
    private ArrayList<Snack> snacks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addSnack() {
        System.out.print("과자명을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("과자 가격을 입력하세요 : ");
        int price = Integer.parseInt(sc.nextLine());

        System.out.print("과자 재고수량을 입력하세요 : ");
        int quantity = Integer.parseInt(sc.nextLine());


        Snack snack1 = new Snack(name, price, quantity);
        Snack snack2 = new Snack("오맛나과자", 5000, 3);
        Snack snack3 = new Snack("양파맛나과자", 8000, 5);

        snacks.add(snack1);
        snacks.add(snack2);
        snacks.add(snack3);
        for (int i = 0; i < snacks.size(); i++) {
            System.out.println(snacks.get(i));
        }
    }

    public void removeSnack() {
        if (snacks.isEmpty()) {
            System.out.println("현재 저장되어 있는 과자 목록이 없습니다.");
            return;
        }
        System.out.print("과자명을 입력하세요 : ");
        String name = sc.nextLine();

        for (Snack snack : snacks) {
            if (snack.getSnackName().equals(name)) {
                snacks.remove(snack);
                System.out.println("삭제되었습니다.");
                return;
            }
        }
        System.out.println("일치하는 과자는 없습니다.");
    }
}

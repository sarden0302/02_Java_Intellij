package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;
import java.util.Scanner;

public class SubwayService {
    public void method1() {
        HashMap<String, Integer> menu = new HashMap<>();

        menu.put("Italian BMT", 6200);
        menu.put("Chicken 데리야끼", 6300);

        System.out.println("서브웨이 메뉴에 따른 가격 목록 : " + menu);
    }

    public void method2() {
        HashMap<String, Integer> menu = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sandwich name : ");
        String menuName = scanner.nextLine();
        System.out.print("Sandwich price : ");
        int menuPrice = Integer.parseInt(scanner.nextLine());

        menu.put(menuName, menuPrice);

        System.out.println("추가한 메뉴 이름과 가격 : " + menu);

        menu.put("Italian BMT", 6200);
        menu.put("Chicken 데리야끼", 6300);

        System.out.println("서브웨이 메뉴에 따른 가격 목록 : " + menu);
    }
}

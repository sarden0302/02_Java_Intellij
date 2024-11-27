package com.kh.CollectionEx.pack2.setEx;

import java.util.HashSet;

public class MenuService {
    private HashSet<Menu> menuSet = new HashSet<Menu>();

    //menu 추가
    public void addMenu(Menu menu) {
        if (menuSet.add(menu)) {
            System.out.println("메뉴가 추가되었습니다." + menu);
        } else {
            System.out.println("이미 존재하는 메뉴입니다" + menu);
        }
    }
    //delete menu
    public void removeMenu(int id) {
        for (Menu menu : menuSet) {
            if (menu.getId() == id) {
                menuSet.remove(menu);
                break;
            }
        }
        System.out.println("해당 메뉴가 삭제되었습니다.");
    }

    // search menu
    public Menu searchMenu(int id) {
        if (menuSet.isEmpty()) {
            System.out.println("검색할 메뉴가 존재하지 않습니다.");
            return null;
        }
        for (Menu menu : menuSet) {
            if (menu.getId() == id) {
                System.out.println(menu);
                return menu;
            }
        }
        System.out.println("검색된 메뉴가 없습니다.");
        return null;
    }

    // all menu
    public void printAllMenu() {
        if (menuSet.isEmpty()) {
            System.out.println("조회할 메뉴가 존재하지 않습니다.");
            return;
        }
        System.out.println("--- 모든 메뉴 조회하기 ---");
        for (Menu menu : menuSet) {
            System.out.println(menu);
        }
    }
}


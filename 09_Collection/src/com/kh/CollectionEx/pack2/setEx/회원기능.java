package com.kh.CollectionEx.pack2.setEx;

import java.util.ArrayList;

public class 회원기능 {
    private ArrayList<회원> users = new ArrayList<>();

    public void addUser(회원 user) {
        users.add(user);
    }

    public void allUser() {
        if (users.isEmpty()) {
            System.out.println("회원이 없습니다. 화이팅..");
            return;
        }

        for (회원 u : users) {
            System.out.println(u.toString());
        }
    }

    public void searchUser(int id) {
        if (users.isEmpty()) {
            System.out.println("회원 없어.. 모해? 빨리 나가서 사람들 바짓자랑이라도 붙잡아");
            return;
        }

        for (회원 user : users) {
            if (user.getId() == id) {
                System.out.println("검색하신 회원 정보는 : " + user.toString() + "입니다");
                return;
            }
        }

        System.out.println("검색하신 회원 정보가 없습니다.");

    }

    public void deleteUser(int id) {
        if (users.isEmpty()) {
            System.out.println("...아무도 없어.. 다른 일 알아봐 걍..");
            return;
        }
        for (회원 user : users) {
            if (user.getId() == id) {
                System.out.println("성공적으로 " + user.getName() + "님의 정보를 삭제하였습니다.");
                users.remove(user);
                return;
            }
        }

        System.out.println("검색하신 회원 정보가 없습니다.");
    }
}

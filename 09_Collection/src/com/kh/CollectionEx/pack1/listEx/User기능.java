package com.kh.CollectionEx.pack1.listEx;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter @Setter
public class User기능 {

    private ArrayList<User> userList = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    // 사용자 추가 기능 만들기!
    public void addUser() {
        /*  private String username;
            private String password;
            private String email;
         */
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String password = scanner.nextLine();
        System.out.print("이메일 : ");
        String email = scanner.nextLine();

        userList.add(new User(name, password, email));
        System.out.println("성공적으로 추가되었습니다.");
    }

    // User 목록 조회하기
    public void allUsers() {
        System.out.println("\n==== 추가된 사용자 목록 ====");
        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
            return;
        }
        for (User user : userList) {
            System.out.println(user);
        }
        /*
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        */
    }

    // User 삭제하기
    public void removeUser() {
        if (userList.isEmpty()) {
            System.out.println("현재 전부 탈퇴한 상태입니다.");
            return;
        }

        System.out.println("\n=== 유저 삭제 ===");
        System.out.print("퇴출할 유저 이름 : ");
        String name = scanner.nextLine();
        boolean found = false;

        for (User user : userList) {
            if (user.getUsername().equals(name)) {
                userList.remove(user);
                System.out.println(name + "님은 퇴출되었습니다.");
                found = true;
                return;
            }
        }

        if (!found) {
            System.out.println("찾으시는 분이 없습니다. 제대로 확인하시고 작성하세요. 또 한번 실수하시면 당신이 퇴출됩니다.");
        }
    }
}

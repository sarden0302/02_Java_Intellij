package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {
    //field
    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public MemberMenu() {

    }

    public void mainMenu() {
        try {
            System.out.println("최대 등록 가능한 회원 수는 10명입니다.\n현재 등록된 회원 수는 " + mc.getM().length + "명입니다.");
            if (mc.getM().length <= mc.getSIZE()) {
                System.out.println("1. 새 회원 등록");
            } else {
                System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
            }
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    insertMember();
                    mainMenu();
                    break;
                case 2:
                    searchMember();
                    mainMenu();
                    break;
                case 3:
                    updateMember();
                    mainMenu();
                    break;
                case 4:
                    deleteMember();
                    mainMenu();
                    break;
                case 5:
                    printAll();
                    mainMenu();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 입력은 1, 2, 3, 4, 5, 9 중에서 입력해주세요.");
                    mainMenu();
            }

        } catch (NumberFormatException e) {
            System.out.println("메뉴 입력은 1, 2, 3, 4, 5, 9 중에서 입력해주세요.");
            mainMenu();
        }
    }

    public void insertMember() {
        try {
            System.out.print("아이디 : ");
            String userId = sc.nextLine();
            for (Member member : mc.getM()) {
                if (member.getId() == userId) {
                    System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
                    insertMember();
                    return;
                }
            }
            System.out.print("이름 : ");
            String userName = sc.nextLine();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();
            System.out.print("이메일 : ");
            String userEmail = sc.nextLine();
            char gender = 'a';
            while(gender != 'M' && gender != 'F' && gender != 'm' && gender != 'f') {
                System.out.print("성별(M/F) : ");
                gender = sc.next().charAt(0);
            }
            System.out.print("나이 : ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println(mc.insertMember(userId, userName, password, userEmail, gender, age));

        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하셨습니다. 처음부터 다시 입력해주세요.");
            insertMember();
        }
    }

    public void searchMember() {


    }

    public void searchId() {

    }

    public void searchName() {

    }

    public void searchEmail() {

    }

    public void updateMember() {

    }

    public void updatePassword() {

    }

    public void updateName() {

    }

    public void updateEmail() {

    }

    public void deleteMember() {

    }

    public void deleteOne() {

    }

    public void printAll() {

    }
}

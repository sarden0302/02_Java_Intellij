package com.kh.hw.member.view;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Objects;
import java.util.Scanner;

public class MemberMenu {
    //field
    private Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public MemberMenu() {

    }

    public void mainMenu() {
        boolean full = false;
        try {
            System.out.println("최대 등록 가능한 회원 수는 10명입니다.\n현재 등록된 회원 수는 " + mc.getCount() + "명입니다.");
            if (mc.getCount() <= mc.getSIZE()) {
                System.out.println("1. 새 회원 등록");
            } else {
                System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
                System.out.println();
                full = true;
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
                    if (full) {
                        System.out.println("잘못된 번호 입력입니다. 메인화면으로 돌아갑니다");
                        break;
                    }
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAll();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 입력은 "+ ((!full) ? " 1, " : "")  + "2, 3, 4, 5, 9 중에서 입력해주세요.");
            }
            mainMenu();

        } catch (NumberFormatException e) {
            System.out.println("메뉴 입력은 "+ ((!full) ? " 1, " : "")  + "2, 3, 4, 5, 9 중에서 입력해주세요.");
            mainMenu();
        }
    }

    public void insertMember() {
        try {
            System.out.print("아이디 : ");
            String userId = sc.nextLine();

            for (Member member : mc.getM()) {
                if (member != null) {
                    if (member.getId().equals(userId)) {
                        System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
                        insertMember();
                        return;
                    }
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
                gender = sc.nextLine().charAt(0);
                if (gender != 'M' && gender != 'F' && gender != 'm' && gender != 'f') {
                    System.out.println("성별을 다시 입력하세요.");
                }
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
        try {
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴 번호 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    searchId();
                    break;
                case 2:
                    searchName();
                    break;
                case 3:
                    searchEmail();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("1, 2, 3, 9 중에 작성해주세요.");
                    searchMember();
            }
        } catch (NumberFormatException e) {
            System.out.println("1, 2, 3, 9 중에 작성해주세요.");
            searchMember();
        }
    }

    public void searchId() {
        System.out.print("검색할 아이디를 작성해주세요 : ");
        String id = sc.nextLine();
        System.out.println(mc.searchId(id));
    }

    public void searchName() {
        System.out.print("검색할 이름을 작성해주세요 : ");
        String name = sc.nextLine();
        boolean checking = mc.searchName(name);
    }

    public void searchEmail() {
        System.out.print("검색할 이메일을 작성해주세요 : ");
        String email = sc.nextLine();
        boolean checking = mc.searchEmail(email);
    }

    public void updateMember() {
        try {
            System.out.println("1. 비밀번호 수정하기");
            System.out.println("2. 이름 수정하기");
            System.out.println("3. 이메일 수정하기");
            System.out.println("9. 메인으로 돌아가기");
            System.out.print("메뉴 번호 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1:
                    updatePassword();
                    break;
                case 2:
                    updateName();
                    break;
                case 3:
                    updateEmail();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("보기에 없습니다. 다시 입력해주세요.");
                     updateMember();
            }
        } catch (NumberFormatException e) {
            System.out.println("1, 2, 3, 9 중에 작성해주세요.");
            updateMember();
        }
    }

    public void updatePassword() {
        System.out.print("수정할 회원 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 회원 비밀번호를 입력해주세요 : ");
        String password = sc.nextLine();

        if (!mc.updatePassword(id, password)) {
            System.out.println("존재하지 않는 아이디입니다.");
            return;
        }
        System.out.println("수정이 성공적으로 되었습니다.");
    }

    public void updateName() {
        System.out.print("수정할 회원 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 회원 이름을 입력해주세요 : ");
        String name = sc.nextLine();

        if (!mc.updateName(id, name)) {
            System.out.println("존재하지 않는 아이디입니다.");
            return;
        }
        System.out.println("수정이 성공적으로 되었습니다.");
    }

    public void updateEmail() {
        System.out.print("수정할 회원 ID를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("수정할 회원 이름을 입력해주세요 : ");
        String email = sc.nextLine();

        if (!mc.updateEmail(id, email)) {
            System.out.println("존재하지 않는 아이디입니다.");
            return;
        }
        System.out.println("수정이 성공적으로 되었습니다.");
    }

    public void deleteMember() {
        System.out.println("1. 특정 회원 삭제하기");
        System.out.println("2. 모든 회원 삭제하기");
        System.out.println("9. 메인으로 돌아가기");
        try {
            System.out.print("메뉴 번호 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    deleteOne();
                    break;
                case 2:
                    deleteAll();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("1, 2, 9 중에서 작성해주세요.");
                    deleteMember();
            }
        } catch(NumberFormatException e) {
            System.out.println("잘못된 입력 방식입니다.");
            deleteMember();
        }
    }

    public void deleteOne() {
        System.out.print("삭제할 회원의 아이디 : ");
        String id = sc.nextLine();
        while (true) {
            System.out.print("정말 삭제하시겠습니까?(y/n) : ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("y")) {
                if (mc.delete(id)) {
                    System.out.println("성공적으로 삭제하였습니다.");
                    return;
                }
                System.out.println("존재하지 않는 회원입니다.");
                break;
            }
            if (check.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("삭제 기능을 종료하고 메인 화면으로 돌아갑니다.");
    }

    public void deleteAll() {
        mc.delete();
        System.out.println("성공적으로 삭제하였습니다.");
    }

    public void printAll() {
        if (mc.getM()[0]== null) {
            System.out.println("현재 명단은 비어있습니다.");
            return;
        }
        mc.printAll();
    }
}

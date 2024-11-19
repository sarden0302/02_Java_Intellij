package practice.condition;

import java.util.Scanner;

public class Practice1 {
    static Scanner sc = new Scanner(System.in);

    public void method1() {

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");
        int choice = sc.nextInt();
        String result = "";

        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                System.out.println("잘못된 번호입니다 다시 입력해주세요.");
                method1();
                return;
        }
        System.out.println(result + " 메뉴입니다.");
        if (!result.equals("종료")) {
            method1();
        }
    }

    public void method2() {
        System.out.print("=== 홀수 or 짝수 ===\n숫자 입력 : ");
        int number = sc.nextInt();
        if (number >= 0) {
            if (number % 2 == 0) {
                System.out.println("짝수입니다");
                return;
            }
            System.out.println("홀수입니다");
            return;
        }
        System.out.println("정수만 입력 가능합니다.");
    }

    public void method3() {
        System.out.print("아이디를 입력해주세요 : ");
        String userId = sc.next();
        System.out.print("비밀번호를 입력해주세요 : ");
        String password = sc.next();

        if (!userId.equals("myId") && !password.equals("myPassword12")) {
            System.out.println("아이디 비밀번호 모두 틀렸습니다.");
            return;
        }

        if (!userId.equals("myId")) {
            System.out.println("아이디가 틀렸습니다.");
            return;
        }

        if (!password.equals("myPassword12")) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        System.out.println("로그인 성공!");
    }
}

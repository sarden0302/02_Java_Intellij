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

    public void method4() {
        try {
            System.out.print("1~12 사이의 정수 입력 : ");
            int season = Integer.parseInt(sc.nextLine());
            switch (season) {
                case 3:
                case 4:
                case 5:
                    System.out.println(season + "월은 봄입니다.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(season + "월은 여름입니다.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(season + "월은 가을입니다.");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println(season + "월은 겨울입니다.");
                    break;
                default:
                    System.out.println(season + "월은 잘못 입력한 달입니다.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력해주세요.");
            method4();
        }
    }

    public void method5() {
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

    public void method10() {
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("*** 실행할 기능을 선택하세요. ***");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // main() 예외적으로 클래스파일명 변수명 = new 클래스파일명();
                    // 작성 후 불러올 수 있다.
                    method1();
                    break;
                case 2:
                    method2();
                    break;
                case 3:
                    System.out.println("기능 준비중입니다.");
                    break;
                case 4:
                    method4();
                    break;
                case 5:
                    method5();
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("기능 준비중입니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    isTrue = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }

        }
    }
}

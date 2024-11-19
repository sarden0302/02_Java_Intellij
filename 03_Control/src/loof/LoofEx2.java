package loof;

import java.util.Scanner;

public class LoofEx2 {
    Scanner sc = new Scanner(System.in);

    public void while1() {

    }

    public void while2() {
        boolean xyz = true;

        while(xyz) {
            System.out.println("현재값 xyz : " + xyz);
            System.out.println("xyz의 값을 false로 변경하려면 'no'를 입력하세요.");
            String input = sc.nextLine();

            // equalsIgnoreCase : 대문자/소문자 상관없이 읽음
            if (input.equalsIgnoreCase("no")) {
                xyz = false;
            }
        }

        System.out.println("xyz가 false로 설정되어 반복이 종료되었습니다.");
    }

    public void while3() {
        System.out.println("=== 0이되면 종료되는 세상 ===");
        int input = -1;
        while(input != 0) {
            System.out.print("숫자를 입력하세요 (0을 입력하면 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }
        System.out.println("종료합니다.");
    }

    public void while4() {
        System.out.println("=== 음수가 되면 종료되는 세상 ===");
        int input = 0;
        while(input >= 0) {
            System.out.print("숫자를 입력하세요 (음수를 입력하면 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }
        System.out.println("종료합니다.");
    }
}
